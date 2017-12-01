
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class InputFromFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        

        try
        {
            File file = new File("CS1083_Output_File.txt");
            Scanner scan = new Scanner(file);
       
            System.out.println();
            System.out.println("Here is the contents of (" + file.getName() + "):");
            System.out.println();
            
            while (scan.hasNext())
                System.out.println(scan.nextLine());
            
        }
        catch (IOException ex)
        {
            System.out.println("Error reading input file!\n" + ex);
        }
        finally
        {
           System.out.println();
        }
    }
    
}
