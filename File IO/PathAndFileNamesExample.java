
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class PathAndFileNamesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            Scanner scan = new Scanner(System.in);
        
            String inputText;            
            
//            Path path = Paths.get("C:\\CS1083");
        
//            String fileName = path + "\\outputFile.txt";

            String fileName = "C:\\CS1083\\outputFile.txt";

            PrintWriter outputFile = new PrintWriter(fileName);
        
            do {
                System.out.println();
                System.out.print("Enter a line of text to be appended to the file or x to exit: ");
                inputText = scan.nextLine();
            
                if (inputText.compareToIgnoreCase("x") != 0)
                {
                    outputFile.print(inputText);
                    outputFile.println();
                 
                    System.out.println();
                    System.out.println("Your text was added to (" + fileName + ") file.");                
                }
            } while (inputText.compareToIgnoreCase("x") != 0);
        
                outputFile.close();        
                
                File inFile = new File(fileName);
                
                scan = new Scanner(inFile);
       
                System.out.println();
                System.out.println("Here is the contents of (" + inFile.getName() + "):");
                System.out.println();
            
                while (scan.hasNext())
                    System.out.println(scan.nextLine());
        }
        catch (IOException ioexp)
        {
            System.out.println("IO Exception was thrown!\n\n" + ioexp);
        }
        catch (Exception exp)
        {
            System.out.println("Generic Exception was thrown!\n\n" + exp);
        }        

    }
    
}
