
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class PrintWriterExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String inputText;
        
        System.out.println();
        System.out.print("Enter output file name: ");
        String fileName = scan.nextLine();
        
        
        
        try {
            PrintWriter outputFile = new PrintWriter(fileName);

            do {
                System.out.println();
                System.out.print("Enter a line of text to be appended to the file or x to exit: ");
                inputText = scan.nextLine();
            
                if (inputText.compareToIgnoreCase("x") != 0)
                {
                    outputFile.println(inputText);
                 
                    System.out.println();
                    System.out.println("Your text was added to (" + fileName + ") file.");                
                }
            } while (inputText.compareToIgnoreCase("x") != 0);
        
            outputFile.close();
        }
        catch (IOException ioexp) {
            System.out.println("Error opening output file!!!\n" + ioexp);
        }

    }
    
}