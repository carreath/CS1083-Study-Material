
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class IntegerKey_BST_Recursion_Example {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        IntegerKey_BST_Recursion_Management bstMan = new IntegerKey_BST_Recursion_Management();

        try {
            System.out.println();
            System.out.print("Enter root node value...");
            Value_Entry(bstMan, 1);
            
            System.out.println();
            System.out.print("Enter at least 10 positive Integers...");
            Value_Entry(bstMan, 10);

            Print(bstMan);
            
            Search(bstMan);
        }
        catch (Exception exp)
        {
            System.out.println("Error entering information or adding " +
                                "values to the binary search tree.\n\n" + exp);
        }            
    }
    
    
    public static void Value_Entry(IntegerKey_BST_Recursion_Management bstMan, int num) 
    {
        int value, counter = 0;
        
        try {
            do {
                System.out.println();
                System.out.print("Enter a positive integer or 0 to exit: ");
                value = scan.nextInt();
            
                if (value > 0)
                {
                    counter++;
                    System.out.println(bstMan.insert(value));
                }
                else if (value < 0)
                {
                    System.out.println();
                    System.out.print("Only positive integers are accepted.");
                }
                else if (value == 0 && counter < num)
                {
                    System.out.println();
                    System.out.print("You should enter at least " + num + " integers.");
                }
                    
            } while (((value != 0) && num > 1) || counter < num);
        }
        catch (Exception exp) {
            System.out.println("Error in data entry or inserting values to the binary search tree!\n" + exp);
        }
    }
    
    
    
    public static void Search(IntegerKey_BST_Recursion_Management bstMan) 
    {
        int value;
        
        System.out.println();
        System.out.print("Now you can search for node values in the binary tree...");
        
        try {
            do {
                System.out.println();
                System.out.print("Enter a positive integer or 0 to exit: ");
                value = scan.nextInt();
            
                if (value > 0){
                    if (bstMan.search(value))
                        System.out.println("(" + value + ") is FOUND in the binary search tree.");
                    else
                        System.out.println("(" + value + ") is NOT in the binary search tree.");
                }
                else if (value < 0)
                {
                    System.out.println();
                    System.out.print("Only positive integers are accepted.");
                }
            } while (value != 0);
        }
        catch (Exception exp) {
            System.out.println("Error in data entry or searching values in the binary search tree!\n" + exp);
        }
    }
    
    
    
    public static void Print(IntegerKey_BST_Recursion_Management bstMan) 
    {
        try {
            
            System.out.println();
            System.out.println("Value in root node is: " + bstMan.rootValue());
            
            System.out.println();
            System.out.println("Pre-Order Traversal result...");
            System.out.println(bstMan.preOrder());
            
            System.out.println("\n");
            System.out.println("In-Order Traversal result...");
            System.out.println(bstMan.inOrder());            
          
            System.out.println("\n");
            System.out.println("Post-Order Traversal result...");
            System.out.println(bstMan.postOrder());            
            
            System.out.println("\n");
            System.out.println("Level-Order Traversal result...");
            System.out.println(bstMan.levelOrder());
            
            System.out.println("\n");
            System.out.println("Minimum value in the BST is: " + bstMan.minValue());
            System.out.println();
            System.out.println("Maximum value in the BST is: " + bstMan.maxValue());            
        }
        catch (Exception exp) {
            System.out.println("Error while traversing the binary search tree!\n" + exp);
            exp.printStackTrace();
        }
    }

}
