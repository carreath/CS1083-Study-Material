
/**
 *
 * @author Eltaher
 */
public class InsertionSort {
    
    public void Perform_Insertion_Sort(Object[] arrayToSort)
    {
        int i, j;
        for (i = 1; i < arrayToSort.length; i++)
        {
            Comparable temp = (Comparable) arrayToSort[i];
            for (j = i; j > 0 && temp.compareTo(arrayToSort[j-1]) < 0; j--)
                arrayToSort[j] = arrayToSort[j-1];
            
            arrayToSort[j] = temp;
        }
    }
}
