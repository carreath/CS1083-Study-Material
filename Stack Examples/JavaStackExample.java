
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Eltaher
 */
public class JavaStackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Stack stack = new Stack();
        
        String msg;
        try {
            
            System.out.println();
            System.out.print("Java Stack implementation. Message decoder...");
            do {
                System.out.println();
                System.out.print("Enter a message or x to exit: ");
                msg = scan.nextLine();
            
                if (msg.compareToIgnoreCase("x") != 0)
                {
                    for (int i = 0; i < msg.length(); i++) {
                        
                        if (msg.charAt(i) != ' ')
                            stack.push(msg.charAt(i));
                        
                        if (msg.charAt(i) == ' ' || (i == msg.length() - 1)) {
                            while (!stack.empty())
                                System.out.print(stack.pop());
                            System.out.print(" ");
                        }
                    }
                }
            } while ((msg.compareToIgnoreCase("x") != 0));
        }
        catch (Exception exp)
        {
            System.out.println();
            System.out.println("Error using stack.\n\n");
            exp.printStackTrace();
        }
    }            
}
