import java.util.Scanner;

/**
 * A utlilty class to read user input from the command line
 */

public class InputReader
{


    private Scanner scanner;





    public InputReader()
    {



        scanner = new Scanner(System.in);

    }

    /**
     * Returnes the line of input entered by the user at the command line
     * @return the line of input entered by the user at the command line
     */

    public String getInput()
    {
        return scanner.nextLine();

    }
}
