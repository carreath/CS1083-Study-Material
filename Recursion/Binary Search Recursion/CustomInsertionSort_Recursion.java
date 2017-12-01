
/**
 *
 * @author Eltaher
 */
public class CustomInsertionSort_Recursion {
    
    public void Perform_Insertion_Sort(int[] arrayToSort, int index)
    {
        index++;
        if (index < arrayToSort.length)
        {
            int temp = arrayToSort[index];
            int indexOfLeastValue = Perform_Value_Comparison(arrayToSort, temp, index+1);
            arrayToSort[indexOfLeastValue] = temp;
            Perform_Insertion_Sort(arrayToSort, index);
        }
    }
        
        
    public int Perform_Value_Comparison(int[] arrayToSort, int temp, int index)
    {
        index--;
        int indexForInsertion = index;
        if(index > 0 && temp < arrayToSort[index-1])
        {
            arrayToSort[index] = arrayToSort[index-1];
            indexForInsertion = Perform_Value_Comparison(arrayToSort, temp, index);
        }

        return indexForInsertion;
    }
}
