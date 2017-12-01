
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class HeadAndTailLinkedListExample {

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
                        Integer_LinkedList_Management.addFromHead(value);
                    else
                        Integer_LinkedList_Management.addFromTail(value);
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
            
            System.out.println();
            System.out.println("Here is the FIRST value in the List traversing from HEAD...");
            System.out.println();       
            System.out.println(Integer_LinkedList_Management.getFirst());
            
            System.out.println();
            System.out.println("Here is the LAST value in the List traversing from HEAD...");
            System.out.println();       
            System.out.println(Integer_LinkedList_Management.getLastFromHead());            

            System.out.println();
            System.out.println("Here is the LAST value in the List traversing from TAIL...");
            System.out.println();       
            System.out.println(Integer_LinkedList_Management.getLastFromTail());            
                        
            System.out.println();
            System.out.print("Enter a new value to add to the rear of the list using HEAD traversal: ");
            value = scan.nextInt();
            
                    
            Integer_LinkedList_Management.addFromHead(value);

            List_All();
            
            System.out.println();
            System.out.print("Enter a new value to add to the rear of the list using TAIL traversal: ");
            value = scan.nextInt();
            
                    
            Integer_LinkedList_Management.addFromTail(value);

            List_All(); 
            
              // This works with doubly linkedlist
//            do {
//                System.out.println();
//                System.out.print("Enter the index of the value you want to get from the LinkedLst or 0 to exit: ");
//                value = scan.nextInt();            
//                if (value > 0)
//                    System.out.println(Integer_LinkedList_Management.get(counter));
//                else if (value < 0)
//                    System.out.println("Invalid index entered.");
//            } while (value != 0);
        }
        catch (Exception exp)
        {
            System.out.println("Error entering information or adding " +
                                "values to the linked list.\n\n" + exp);
        }
    }
    
    
    public static void List_All()
    {
        System.out.println();
        System.out.println("Here is the List of integers in the LinkedList...");
        System.out.println();
        Integer_LinkedList_Management.listAllValues();
    }
    
}        
