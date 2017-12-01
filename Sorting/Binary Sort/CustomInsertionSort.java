
/**
 *
 * @author Eltaher
 */
public class CustomInsertionSort {
    
    public void Perform_Insertion_Sort(int[] arrayToSort)
    {
        int i, j;
        for (i = 1; i < arrayToSort.length; i++)
        {
            int temp = arrayToSort[i];
            for (j = i; j > 0 && temp < arrayToSort[j-1]; j--)
                arrayToSort[j] = arrayToSort[j-1];
            
            arrayToSort[j] = temp;
        }
    }
}
