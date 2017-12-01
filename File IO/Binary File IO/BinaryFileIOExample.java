

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class BinaryFileIOExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String name, more = "";
        int accountNo, counter = 0;
        float balance;
        
        Customer customer;
        
        System.out.println();
        System.out.print("Enter output file name: ");
        String fileName = scan.nextLine();

        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream fOut = new FileOutputStream(fileName);
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);

            do {
                System.out.println();
                System.out.print("Enter customer name: ");
                name = scan.nextLine();
                
                System.out.print("Enter customer account number: ");
                accountNo = scan.nextInt();                
            
                System.out.print("Enter customer balance: ");
                balance = scan.nextFloat();
                scan.nextLine();
                customer = new Customer(name, accountNo, balance);
                
                oOut.writeObject(customer);
                counter++;

                do {
                    System.out.println();
                    System.out.print("More customers (y/n)?");
                    more = scan.nextLine();
                    if (more.compareToIgnoreCase("Y") != 0 && more.compareToIgnoreCase("N") != 0)
                        System.out.println("You must answer the question with either 'y' or 'n'.");
                } while (more.compareToIgnoreCase("Y") != 0 && more.compareToIgnoreCase("N") != 0);
            } while (more.compareToIgnoreCase("y") == 0);
        
            oOut.close();

            // create an ObjectInputStream for the file we created before
            ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(fileName));

            System.out.println();
            // read and print what we wrote before
            for(int j = 0; j < counter; j++)
                System.out.println(oIn.readObject().toString());
         
            System.out.println("No more objects to read from the input stream.");
        }
        catch (InputMismatchException iexp)
        {
            System.out.println("Invalid input enterd!\n" + iexp);
        }
        catch (EOFException eofexp) {
            System.out.println("You have reached to the end of the input file.\n" + eofexp);
        }
        catch (Exception exp) {
            System.out.println("Error while using file!\n" + exp);
        }        

    }

}
