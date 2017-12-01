
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class LinearSearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] intList = {11,23,17,43,28,19,50,21,42,24,29,3,14,6,15,36,46,4,39,
                         26,10,33,44,22,1,9,20,30,40,7};
        
        int target, index;
        
        Scanner scan = new Scanner(System.in);
        
        LinearSearch lSearch = new LinearSearch();
        
        do {
            System.out.println();
            System.out.println("Linear search example...");
            System.out.print("Enter a value between 1-50 to search for, or 0 to exit: ");
            target = scan.nextInt();
            System.out.println();
            
            if (target < 0 || target > 50)
                System.out.println("Only integers between 0-50 are acceptable!");
            else if (target > 0)
            {
                System.out.println("List contents:");
                for (int i = 0; i < intList.length; i++)
                     System.out.print("  " + intList[i]);
                System.out.println();
                System.out.println();                
                
                index = lSearch.Perform_Linear_Search(intList, target);
                if (index > -1)
                    System.out.println("The number (" + target + ") was found in the list at location(" + (index + 1) + ").");
                else 
                    System.out.println("The number (" + target + ") was not found in the list.");
            }
        } while (target != 0);
    }
    
}
