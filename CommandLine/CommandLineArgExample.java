
/**
 *
 * @author Eltaher
 */
public class CommandLineArgExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            if (args.length > 0)
            {
                for (int i = 0; i < args.length; i++)
                     System.out.println("Argument [" + i + "] = " + args[i]);
            }
            else
                System.out.println("You didn't supply any arguments.");
        }
        catch (Exception exp)
        {
            System.out.println("Something went wrong while reading your arguments.\n\n" + exp);
        }

    }
    
}
        