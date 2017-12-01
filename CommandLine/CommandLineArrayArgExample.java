
/**
 *
 * @author Eltaher
 */
public class CommandLineArrayArgExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            if (args.length > 0)
            {
                int counter = -1;
                for (int i = 0; i < args.length; i++)
                {
                    String[] argArray = args[i].split(",");
                    for (int j = 0; j < argArray.length; j++)
                    {
                        counter = counter + 1;
                        System.out.println("Argument [" + counter + "] = " + argArray[j]);
                    }
                }
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
