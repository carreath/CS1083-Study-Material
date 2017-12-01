
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class DoublyLinkedListWithHeadAndTailExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int value, counter = 0;
        
        try {
            
            System.out.println();
            System.out.print("Enter at least 3 positive Integers...");
            do {
                System.out.println();
                System.out.print("Enter a positive integer or 0 to exit: ");
                value = scan.nextInt();
            
                if (value > 0)
                {
                    counter++;
                    if (counter%2 != 0)
                        Integer_DoublyLinkedList_Management.addFromHead(value);
                    else
                        Integer_DoublyLinkedList_Management.addFromTail(value);
                }
                else if (value < 0)
                {
                    System.out.println();
                    System.out.print("Only positive integers are accepted.");
                }
                else if (value == 0 && counter < 3)
                {
                    System.out.println();
                    System.out.print("You should enter at least 3 integers.");
                }
                    
            } while ((value != 0) || counter < 3);
            
            List_All();
            
            do {
                System.out.println();
                System.out.print("Enter the index of the value you want " +
                                "to get from the Doubly Linked List or -ve value to exit: ");
                value = scan.nextInt();            
                if (value >= 0)
                    System.out.println(Integer_DoublyLinkedList_Management.get(value));
            } while (value >= 0);
        }
        catch (Exception exp)
        {
            System.out.println("Error entering information or adding " +
                                "values to the doubly linked list.\n\n" + exp);
        }
    }
    
    
    public static void List_All()
    {
        System.out.println();
        System.out.println("Here is the List of integers in the Doubly Linked List...");
        System.out.println();
        Integer_DoublyLinkedList_Management.listAllValues();
    }
    
}        
