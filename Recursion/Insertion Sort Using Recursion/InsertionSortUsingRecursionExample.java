
/**
 *
 * @author Eltaher
 */
public class InsertionSortUsingRecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer[] integerArray = { 45, 65, 12, 19, 54, 23, 0, 90, -1, 4};
        String[] stringArray = { "Sam", "Greg", "Venessa", "Leo", "Alex", 
                                 "Kate", "Jodi", "Amy", "Aaron", "Monica"};
        
        Select_And_Sort_Array(integerArray, stringArray, -1);
     }

    
    public static void Select_And_Sort_Array(Integer[] integerArray, String[] stringArray, int chosenArray)
    {
        Object[] arrayToSort = null;
        InsertionSort_Recursion insSort = new InsertionSort_Recursion();
        
        try {
            chosenArray++;
            if (chosenArray == 0)
                arrayToSort = integerArray;
            else if (chosenArray == 1)
                arrayToSort = stringArray;

            if (chosenArray < 2)
            {
                System.out.println();
                System.out.print("Array contents before performing Recursive Insertion Sort...");
                System.out.println();
            
                Print_Array_Contents(arrayToSort, -1);
            
                insSort.Perform_Insertion_Sort(arrayToSort, 0);
        
                System.out.println();
                System.out.println();
                System.out.print("Array contents After performing Recursive Insertion Sort...");
                System.out.println();

                Print_Array_Contents(arrayToSort, -1);
        
                System.out.println();
                System.out.println();
            }
        
            if (chosenArray < 1)
                Select_And_Sort_Array(integerArray, stringArray, chosenArray);
        }
        catch (Exception exp) {
            System.out.println("An Exception was thrown, check your code for bugs.\n\n" + exp);
        }
    }
    
    
    public static void Print_Array_Contents(Object[] arrayToSort, int index)
    {
        index++;
        if (index < arrayToSort.length)
        {
            System.out.print(arrayToSort[index] + "     ");
            Print_Array_Contents(arrayToSort, index);
        }
    }
    
}

