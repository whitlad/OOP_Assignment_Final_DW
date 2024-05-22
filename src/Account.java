import java.time.LocalDate;
import java.util.HashSet;
public abstract class Account {
    public static int NEXT_ACCOUNT_NUMBER = 1;
    private int number;
    private int balance;
    private boolean active;
    private LocalDate dateActivated;
    private LocalDate dateClosed;
    private Customer customer;
    private HashSet<Transaction> transactions;
    public Account(Customer aCustomer) {
        this.customer = aCustomer;
        this.balance = 0;
        this.active = false;
        this.dateActivated = null;
        this.dateClosed = null;
        this.transactions = new HashSet<>();
        this.number = Account.NEXT_ACCOUNT_NUMBER;
        NEXT_ACCOUNT_NUMBER++;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public int getNumber(){
        return this.number;
    }
    public boolean isActive()
    {
        return this.active;
    }
    /**
     * activates the account and records the date activated
     */
    public void activate() {
        this.active = true;
        this.dateActivated = LocalDate.now();
    }
    /**
     * deactivates the account and records the date deactivated
     */
    public void deactivate()
    {
        this.active =false;
        this.dateClosed=LocalDate.now();
    }
    /**
     * returns the date on which the account was activated as a String
     * @return the date on which the account was activated as a String
     */
    public String getDateActivated()
    {
        String date;
        if (this.dateActivated != null) {
            date = this.dateActivated.toString();
        }
        else {
            date = "The Account has not been activated";
        }
        return date;
    }
    /**
     * Returns the date on which the account was deactivated as a String
     * @return the date on which the account was deactivated as a String
     */
    public String getDateDeactivated()
    {
        String date;
        if(this.dateActivated == null)
        {
            date = "The Account has not been activated";
        }
        else if (this.dateActivated != null && this.dateClosed == null)
        {
            date = "the Account is still active";
        }
        else
        {
            date = this.dateClosed.toString();
        }
        return date;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public void addBalance(int numBalance)
    {
        this.balance+=numBalance;
    }
    public void useBalance(int numBalance)
    {
        if (numBalance <= this.balance)
        {
            this.balance -= numBalance;
        }
    }
    public int numberOfTransactions()
    {
        return this.transactions.size();
    }
    public void addTransaction(Transaction t)
    {
        this.transactions.add(t);
    }
    public void displayDetails()
    {
        String status;
        String date;
        if(this.isActive())
        {
            status= " Account Active ";
            date = this.getDateActivated();
        }
        else
        {
            status = "Account Closed ";
            date = this.getDateDeactivated();
        }
        System.out.println(this.customer.getNumber() + "Balance: " + this.getBalance() + " , " + status + ", " + date);
    }
    public void showTransactions()
    {
        System.out.println("Type\tBalance\tDate/Time\tID");
        for(Transaction t: this.transactions)
        {
            t.showDetails();
        }
    }


}

