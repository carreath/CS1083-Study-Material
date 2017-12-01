
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("TestTextFile.txt");

        try
        {
            Scanner scan = new Scanner(file);
       
            while (scan.hasNext())
                System.out.println(scan.nextLine());
        }
        catch (IOException ex)
        {
            System.out.println("Error reading input file!\n" + ex);
        }
        finally
        {

        }
        
        
    }
    
}
