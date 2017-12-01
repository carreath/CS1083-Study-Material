
/**
 *
 * @author Eltaher
 */
public class SelectionSort_Recursion {
    
        public void Perform_Selection_Sort(Object[] arrayToSort, int index)
        {
            index++;
            if (index < arrayToSort.length - 1)
            {
                int indexOfLeastValue = Perform_Value_Comparison(arrayToSort, index+1, index);
                if (indexOfLeastValue != index)
                    Swap(arrayToSort, indexOfLeastValue, index); 
                Perform_Selection_Sort(arrayToSort, index);
            }
        }
        
        
        public int Perform_Value_Comparison(Object[] arrayToSort, int index, int indexOfLeastValue)
        {
            if(((Comparable) arrayToSort[index]).compareTo(arrayToSort[indexOfLeastValue]) < 0)
                indexOfLeastValue = index;
            
            index++;
            if (index < arrayToSort.length)
                indexOfLeastValue = Perform_Value_Comparison(arrayToSort, index, indexOfLeastValue);

            return indexOfLeastValue;
        }
        
        
        
        private void Swap(Object[] arrayToSort, int indexOfLeastValue, int indexOfLargerValue)
        {
            Object temp = arrayToSort[indexOfLeastValue];
            arrayToSort[indexOfLeastValue] = arrayToSort[indexOfLargerValue];
            arrayToSort[indexOfLargerValue] = temp;
        }
    
}
