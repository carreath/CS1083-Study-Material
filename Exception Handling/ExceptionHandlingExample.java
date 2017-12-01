
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class ExceptionHandlingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account acc = new Account(7500f);

        Scanner scan = new Scanner(System.in);
        String timePeriod = "";
        float result;
        while (timePeriod.compareToIgnoreCase("x") != 0) {
            
            System.out.println();
            System.out.print("Enter time period: ");
            timePeriod = scan.next();
            if (timePeriod.compareToIgnoreCase("x") != 0)
            {
                result = acc.average(timePeriod);
        
                if (result > -1)
                {
                    System.out.println();
                    System.out.println("Total expenses = " + acc.getTotalExpenses());
                    System.out.println("Average expenses per month = " + result);
                }
            }
        }


    }
    
}
