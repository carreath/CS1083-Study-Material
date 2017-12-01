
/**
 *
 * @author Eltaher
 */
public class CustomMadeObjectSorting2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Object[] people = { new Person("George", "Wane", 32),
                            new Person("Sam", "Ashfield", 21), 
                            new Person("Walter", "Baker", 73),
                            new Person("Sam", "Ashfield", 17),
                            new Person("Bob", "Rynolds", 54),
                            new Person("Amy", "Smith", 29),
                            new Person("Bob", "Rynolds", 50),
                            new Person("Amy", "Brown", 50)};

        System.out.println();
        System.out.println("This is the array BEFORE sorting...");
        Print(people);
        
        CustomBubbleSort2 custBubbleSort = new CustomBubbleSort2();
        custBubbleSort.Perform_Bubble_Sort(people);
        
        System.out.println();
        System.out.println("This is the array AFTER sorting...");
        Print(people);        
    }
    
    
    public static void Print(Object[] people)
    {
        String style = "%-15s %-15s %-15s %n";
        System.out.println();
        System.out.format(style, "First Name", "Last Name", "Age");
        System.out.println("-----------------------------------");
        style = "%-15s %-15s %-15d %n";
        for (int i = 0; i < people.length; i++)
        {
             System.out.format(style, ((Person) people[i]).getFirstName(),
                                      ((Person) people[i]).getLastName(),
                                      ((Person) people[i]).getAge());
        }
    }
    
}
