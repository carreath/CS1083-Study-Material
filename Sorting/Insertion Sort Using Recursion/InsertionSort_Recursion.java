
/**
 *
 * @author Eltaher
 */
public class InsertionSort_Recursion {
    
    public void Perform_Insertion_Sort(Object[] arrayToSort, int index)
    {
        index++;
        if (index < arrayToSort.length)
        {
            Comparable temp = (Comparable) arrayToSort[index];
            int indexOfLeastValue = Perform_Value_Comparison(arrayToSort, temp, index+1);
            arrayToSort[indexOfLeastValue] = temp;
            Perform_Insertion_Sort(arrayToSort, index);
        }
    }
        
        
    public int Perform_Value_Comparison(Object[] arrayToSort, Comparable temp, int index)
    {
        index--;
        int indexForInsertion = index;
        if(index > 0 && temp.compareTo(arrayToSort[index-1]) < 0)
        {
            arrayToSort[index] = arrayToSort[index-1];
            indexForInsertion = Perform_Value_Comparison(arrayToSort, temp, index);
        }

        return indexForInsertion;
    }
}
