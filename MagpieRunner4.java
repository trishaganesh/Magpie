
/**
 * A simple class to run the Magpie class.
 *
 *
 * @author Trisha Ganesh
 * @version 6/27/2021
 */

import java.util.Scanner;

public class MagpieRunner4
{

    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}

