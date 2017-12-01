
/**
 *
 * @author Eltaher
 */
public class SelectionSort {
    
        public void Perform_Selection_Sort(Object[] arrayToSort)
        {
            int i, j, indexOfLeastValue;
            for (i = 0; i < arrayToSort.length - 1; i++)
            {
                for (j = i+1, indexOfLeastValue = i; j < arrayToSort.length; j++)
                {
                    if(((Comparable) arrayToSort[j]).compareTo(arrayToSort[indexOfLeastValue]) < 0)
                        indexOfLeastValue = j;
                }
                
                if (i != indexOfLeastValue)
                    Swap(arrayToSort, indexOfLeastValue, i);                
            }
        }
        
        
        private void Swap(Object[] arrayToSort, int indexOfLeastValue, int indexOfLargerValue)
        {
            Object temp = arrayToSort[indexOfLeastValue];
            arrayToSort[indexOfLeastValue] = arrayToSort[indexOfLargerValue];
            arrayToSort[indexOfLargerValue] = temp;
        }
    
}
