
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner (System.in);
        
        do {
            System.out.print("Enter a name or x to exit: ");
            name = scan.nextLine();
            if (name.compareToIgnoreCase("x") != 0)
                System.out.println("Hello, " + name + ".");
            
        } while (name.compareToIgnoreCase("x") != 0);
    }
    
}
