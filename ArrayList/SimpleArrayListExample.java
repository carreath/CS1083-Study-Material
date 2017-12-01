
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class SimpleArrayListExample {

    /**
     * @param args the command line arguments
     */
    
    static int index = 0;
    static ArrayList<String> provinces = new ArrayList(); 
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        
        isEmpty();

        System.out.print("Next, three provinces will be added to the ArrayList. Press enter to continue...");
        scan.nextLine();
        provinces.add("British Columbia");
        provinces.add("Alberta");
        provinces.add("Saskatchewan");
        
        isEmpty();
        print();
        
        System.out.print("Now, Yukon province will be inserted at position 1 and \n" +
                         "New Foundland will be added to the end of the ArrayList. Press enter to continue...");
        scan.nextLine();
        provinces.add(1, "Yukon");
        provinces.add(provinces.size(), "New Foundland");
        
        print();
        
        System.out.print("Now, the province at position 3 will be removed from the ArrayList. Press enter to continue...");
        scan.nextLine();
        provinces.remove(3);
        
        print();
        
        isEmpty();
        
        System.out.print("Now, the ArrayList will be cleared. Press enter to continue...");
        scan.nextLine();
        provinces.clear();
        
        isEmpty();
    }
    
    
    private static void isEmpty()
    {
        System.out.println();
        if (provinces.isEmpty())
            System.out.println("ArrayList is currently empty!");
        else
            System.out.println("Currently, there are (" + provinces.size() + 
                                ") elements in the ArrayList.");     
       
        System.out.println();
        System.out.print("Press enter to continue...");
        scan.nextLine();
    }
    
    
    private static void print()
    {
        System.out.println();
        System.out.println("Elements in the ArrayList:");
        index = 0;
        while (index < provinces.size()) {
               System.out.println(provinces.get(index));
               index++;
        }
        
        System.out.println();
        System.out.print("Press enter to continue...");
        scan.nextLine();
    }
    
}
