
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class PresidentsLinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String name;
        int startYear, endYear, counter = 0;
        
        try {
            
            System.out.println();
            System.out.print("Enter at least 3 Presidents...");
            do {
                System.out.println();
                System.out.print("Enter President's Name or x to exit: ");
                name = scan.nextLine();
            
                if (name.compareToIgnoreCase("x") != 0)
                {
                    System.out.print("Enter Presidency Start Year: ");
                    startYear = scan.nextInt();

                    System.out.print("Enter Presidency End Year: ");
                    endYear = scan.nextInt();
                    scan.nextLine();
                    
                    LinkedList_Management.addPresident(new President(name, startYear, endYear));
                    counter++;
                }
                else if (counter < 3)
                {
                    System.out.println();
                    System.out.print("You should enter at least 3 Presidents.");
                }
                    
            } while ((name.compareToIgnoreCase("x") != 0) || counter < 3);
            
            List_All_Presidents();
            
            System.out.println();
            System.out.println("Here is the FIRST President in the List...");
            System.out.println();       
            System.out.println(LinkedList_Management.getFirstPresident().toString());
            
            System.out.println();
            System.out.println("Here is the LAST President in the List...");
            System.out.println();       
            System.out.println(LinkedList_Management.getLastPresident().toString());            
            
            
            System.out.println();
            System.out.print("Enter President's Name to insert into 2nd location: ");
            name = scan.nextLine();
            
            System.out.print("Enter Presidency Start Year: ");
            startYear = scan.nextInt();

            System.out.print("Enter Presidency End Year: ");
            endYear = scan.nextInt();
            scan.nextLine();
                    
            LinkedList_Management.insertPresident(new President(name, startYear, endYear), 1);

            List_All_Presidents();

            System.out.println();
            System.out.print("Remove the President at 3rd position...");
            System.out.println();
            LinkedList_Management.removePresident(2);
            
            List_All_Presidents();            
            
            System.out.println();
            System.out.print("Remove a President by name...");
            System.out.println();
            System.out.print("Enter the name of the President to remove: ");
            name = scan.nextLine(); 
            President p = LinkedList_Management.getByPresidentName(name);
            
            System.out.println();
            if (p != null)
            {
                LinkedList_Management.removePresident(p);
                List_All_Presidents();                        
            }
            else
                System.out.print("President name not on the list.");
            
            System.out.println();

        }
        catch (Exception exp)
        {
            System.out.println("Error entering information or adding " +
                                "presidents to the linked list.\n\n" + exp);
        }
    }
    
    
    public static void List_All_Presidents()
    {
        System.out.println();
        System.out.println("Here is the List of Presidents...");
        System.out.println();
        LinkedList_Management.listAllPresidents();            
    }
    
}
