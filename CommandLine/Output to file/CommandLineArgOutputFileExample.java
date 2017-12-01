/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class CommandLineArgOutputFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String inputText;
        if (args.length > 0)
        {
            try {
                PrintWriter outputFile = new PrintWriter(args[0]);

                do {
                    System.out.println();
                    System.out.print("Enter a line of text to be appended to the file or x to exit: ");
                    inputText = scan.nextLine();
            
                    if (inputText.compareToIgnoreCase("x") != 0)
                    {
                        outputFile.print(inputText);
                        outputFile.println();
                 
                        System.out.println();
                        System.out.println("Your text was added to (" + args[0] + ") file.");                
                    }
                } while (inputText.compareToIgnoreCase("x") != 0);
        
                outputFile.close();
            }
            catch (IOException ioexp) {
                System.out.println("Error opening output file!!!\n" + ioexp);
            }
        }
        else
            System.out.println("Output file name must be given as the first command line argument!");
    }
    
}
