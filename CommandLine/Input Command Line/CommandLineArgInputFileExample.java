

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class CommandLineArgInputFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try
        {
            if (args.length > 0)
            {
                File file = new File(args[0]);
                Scanner scan = new Scanner(file);
       
                System.out.println();
                System.out.println("Here is the contents of (" + file.getName() + "):");
                System.out.println();
            
                while (scan.hasNext())
                    System.out.println(scan.nextLine());
            }
            else
                System.out.println("Input file name must be given as the first command line argument!");
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
