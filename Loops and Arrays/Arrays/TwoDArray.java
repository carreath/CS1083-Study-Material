
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] qurterlySales = new double[5][3];
        String[] months = {"January", "February", "March"};
        String[] provinces = {"Ontario", "Quebec", "New Brunswick", "Nova Scotia", "New Foundland"};
        
        Scanner scan = new Scanner(System.in);
        
        // for loop
        for (int i = 0; i < provinces.length; i++)
        {
            System.out.println();
            System.out.println("Sales for (" + provinces[i] + ") province.");
            System.out.println();

            for (int j = 0; j < months.length; j++)
            {
                System.out.print("Enter sales in (" + months[j] + "):");
                qurterlySales[i][j] = scan.nextDouble();
            }
        }
        
        System.out.println();
        System.out.println("This is the list of Qurterly Sales . . .");
        System.out.println();
        System.out.print("\t\t\t       ");
        
        String format = "%-18s";
        
        // for-each loop 
        for (String month: months)
             System.out.format(format, month);
        
        System.out.println();
        System.out.println("\t\t\t       -----------------------------------------------");
        System.out.println();
        
        format = "   %-25s";
        String format2 = "   %-15.2f";
        for (int i = 0; i < provinces.length; i++)
        {
            System.out.format(format, provinces[i]);
            
            for (int j = 0; j < months.length; j++)
                System.out.format(format2, qurterlySales[i][j]);
            
            System.out.println();
            System.out.println();
        }

    }
    
}
