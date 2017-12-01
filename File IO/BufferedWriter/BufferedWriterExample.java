
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class BufferedWriterExample {

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
            FileWriter outputFile = new FileWriter(fileName);
            BufferedWriter BR = new BufferedWriter(outputFile);

            do {
                System.out.println();
                System.out.print("Enter a line of text to be appended to the file or x to exit: ");
                inputText = scan.nextLine();
            
                if (inputText.compareToIgnoreCase("x") != 0)
                {
                    BR.write(inputText + System.getProperty("line.separator"));
                 
                    System.out.println();
                    System.out.println("Your text was added to (" + fileName + ") file.");                
                }
            } while (inputText.compareToIgnoreCase("x") != 0);
        
            BR.flush();
            outputFile.close();
            BR.close();
        }
        catch (IOException ioexp) {
            System.out.println("Error opening output file!!!\n" + ioexp);
        }

    }
    
}

