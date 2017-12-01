
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Eltaher
 */
public class JavaStackExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();
        String msg;
        Calendar cal = Calendar.getInstance();
        
        try {
            
            System.out.println();
            System.out.println("Java Stack implementation. Message decoder...");
            do {
                System.out.println();
                System.out.print("Enter a statement or x to exit: ");
                msg = scan.nextLine();
            
                if (msg.compareToIgnoreCase("x") != 0)
                {
                    cal.setTime(new Date());
                    msg += "\t >>> This message was pushed onto the stack at: " + cal.getTime();
                    stack.push(msg);
                    
                    System.out.println();
                    System.out.println("The last message pushed onto the stack is: " + stack.peek());
                }
            } while ((msg.compareToIgnoreCase("x") != 0));
            
            System.out.println("\n\nThis is the sequence of the statements popped out of the stack...");
            System.out.println();
            while (!stack.empty())
                   System.out.println(stack.pop());
        }
        catch (Exception exp)
        {
            System.out.println();
            System.out.println("Error using stack.\n\n");
            exp.printStackTrace();
        }
    }            
}

