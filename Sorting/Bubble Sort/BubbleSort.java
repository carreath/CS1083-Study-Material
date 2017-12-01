
/**
 *
 * @author Eltaher
 */
public class BubbleSort {
    
        public void Perform_Bubble_Sort(Object[] arrayToSort)
        {    
            for (int i = 0; i < arrayToSort.length - 1; i++)
            {
                for (int j = arrayToSort.length - 1; j > i; j--)
                {
                    if(((Comparable) arrayToSort[j]).compareTo(arrayToSort[j-1]) < 0)
                        Swap(arrayToSort, j, j-1);
                }
            }
        }
        
        
        private void Swap(Object[] arrayToSort, int indexOfLesserValue, int indexOfLargerValue)
        {
            Object temp = arrayToSort[indexOfLesserValue];
            arrayToSort[indexOfLesserValue] = arrayToSort[indexOfLargerValue];
            arrayToSort[indexOfLargerValue] = temp;
        }
}
