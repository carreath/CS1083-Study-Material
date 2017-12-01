
/**
 *
 * @author Eltaher
 */
public class BubbleSortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] integerArray = { 45, 65, 12, 19, 54, 23, 0, 90, -1, 4};
        String[] stringArray = { "Sam", "Greg", "Venessa", "Leo", "Alex", 
                                 "Kate", "Jodi", "Amy", "Aaron", "Monica"};
        Object[] arrayToSort;
        BubbleSort bublSort = new BubbleSort();
        
        for (int loop = 0; loop < 2; loop++)
        {
            if (loop == 0)
                arrayToSort = integerArray;
            else
                arrayToSort = stringArray;

            System.out.println();
            System.out.print("Array contents before performing Bubble Sort...");
            System.out.println();
            for (int i = 0; i < arrayToSort.length; i++)
                 System.out.print(arrayToSort[i] + "     ");
       
            bublSort.Perform_Bubble_Sort(arrayToSort);
        
            System.out.println();
            System.out.println();
            System.out.print("Array contents After performing Bubble Sort...");
            System.out.println();
            for (int i = 0; i < arrayToSort.length; i++)
                 System.out.print(arrayToSort[i] + "     ");    
        
            System.out.println();
            System.out.println();
        }
    }
        
}
