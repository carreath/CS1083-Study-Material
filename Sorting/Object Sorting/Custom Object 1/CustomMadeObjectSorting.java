
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class CustomMadeObjectSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Fruit[] fruit = { new Fruit("Pomegranate", "sweet", "autumn", 10.75f),
                          new Fruit("Kiwi", "soure", "summer", 2.45f), 
                          new Fruit("Watermelon", "sweet", "summer", 6.00f),
                          new Fruit("Grapefruit", "bitter", "winter", 1.25f),
                          new Fruit("Banana", "sweet", "summer", 0.99f),
                          new Fruit("Orange", "soure", "winter", 3.50f),
                          new Fruit("Apricot", "sweet", "spring", 6.75f)};

        int choice;
        String style;
        CustomBubbleSort custBubbleSort = new CustomBubbleSort();

        do {
            System.out.println();
            System.out.println("\t\t\tSort Options");
            System.out.println("\t\t\t------------");
            System.out.println("\t\t\t1. By name");
            System.out.println("\t\t\t2. By taste");
            System.out.println("\t\t\t3. By season");
            System.out.println("\t\t\t4. By price");
            System.out.println("\t\t\t5. Exit");
            System.out.println();
            System.out.print("\t\t\tEnter your choice:- ");
            choice = scan.nextInt();
            
            if (choice > 0 && choice < 5)
            {
                custBubbleSort.Perform_Bubble_Sort(fruit, choice - 1);
                System.out.println();
                style = "%-15s %-15s %-15s %-15s %n";
                System.out.format(style, "Name", "Taste", "Season", "Price");
                System.out.println("--------------------------------------" +
                                    "---------------");
                style = "%-15s %-15s %-15s %-10.2f %n";
                for (int i = 0; i < fruit.length; i++)
                {
                    System.out.format(style, (fruit[i]).getFruitAttribute(0), 
                                             (fruit[i]).getFruitAttribute(1),
                                             (fruit[i]).getFruitAttribute(2),
                                             (fruit[i]).getFruitAttribute(3));
                }
            }
            else if (choice < 1 || choice > 5)
                System.out.println("Invalid choice entered!");
        } while (choice != 5);
                          
    }
    
}
