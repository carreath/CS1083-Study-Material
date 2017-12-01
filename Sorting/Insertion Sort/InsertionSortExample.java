
/**
 *
 * @author Eltaher
 */
public class InsertionSortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] integerArray = { 45, 65, 12, 19, 54, 23, 0, 90, -1, 4};
        String[] stringArray = { "Sam", "Greg", "Venessa", "Leo", "Alex", 
                                 "Kate", "Jodi", "Amy", "Aaron", "Monica"};
        Object[] arrayToSort;
        InsertionSort insSort = new InsertionSort();
        
        for (int loop = 0; loop < 2; loop++)
        {
            if (loop == 0)
                arrayToSort = integerArray;
            else
                arrayToSort = stringArray;

            System.out.println();
            System.out.print("Array contents before performing Insertion Sort...");
            System.out.println();
            for (int i = 0; i < arrayToSort.length; i++)
                 System.out.print(arrayToSort[i] + "     ");
       
            insSort.Perform_Insertion_Sort(arrayToSort);
        
            System.out.println();
            System.out.println();
            System.out.print("Array contents After performing Insertion Sort...");
            System.out.println();
            for (int i = 0; i < arrayToSort.length; i++)
                 System.out.print(arrayToSort[i] + "     ");    
        
            System.out.println();
            System.out.println();
        }    }
    
}
