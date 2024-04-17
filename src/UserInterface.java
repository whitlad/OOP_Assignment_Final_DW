/**
 * Provides a user interface for the Banking Application
 *
 */
public class UserInterface {

   // public Library library;  //make it public for testing and private when finished

    private InputReader reader;


    public UserInterface()
    {

        reader = new InputReader();

    }

    /**
     * &
     * shows the main menu for the application until the user chooses to quit
     */

    //Create Customer
    //Update Customer
    //Display Customer Details
    //Open Bank Account
    //Close Bank Account
    //Deposit to Account
    //Withdrawal from Account
    //Display list of all customers
    //Display list of customers and associated each account
    //Display transactions on a particular account
    //SIMPLE MENU SYSTEM

     public void showMainMenu()
    {
        boolean quit = false;


        while (quit == false) //white (!quit) ths is the same as quit == false
        {
            System.out.println("Please choose: ");
            System.out.println("1. Create Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Display Customer Details");
            System.out.println("4. Open Bank Account");
            System.out.println("5. Close Bank Account");
            System.out.println("6. Deposit to Account");
            System.out.println("7. Withdraw from Account");
            System.out.println("8. Display All Customers");
            System.out.println("9. Display All Customers and Associated Accounts");
            System.out.println("10. Display Transactions on Account");
            System.out.println("0. Exit");






            System.out.println("0. exit application");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    //call addBook method
                    this.addBook();
                    break;

                case "2":
                    // call listAllBooks
                    this.listAllBooks();
                    break;

                case "0":
                    quit = true;
                    break;

                default :
                    System.out.println("That is not a valid choice, please try again\n");
                    break;

            }
        }


    }

    /**
     * Allows a user to add a book to the library
     */
    public void addBook()
    {
        System.out.println("Please enter author:");
        String author = reader.getInput();

        System.out.println("Please enter the title");
        String title = reader.getInput();

        System.out.println("Please enter the ISBN");
        String ISBN = reader.getInput();

        Book b = new Book(author, title, ISBN);
        library.addBook(b);
        System.out.println("New Book " + title + " added");  //see if this works


    }

    public void listAllBooks()
    {
        this.library.listAllBooks();

    }


}
