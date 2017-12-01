
/**
 *
 * @author Eltaher
 */
public class CustomBubbleSort {
    
    public void Perform_Bubble_Sort(Fruit[] arrayToSort, int sortFieldIndex)
    {    
        for (int i = 0; i < arrayToSort.length - 1; i++)
        {
            for (int j = arrayToSort.length - 1; j > i; j--)
            {
                if(((Comparable)arrayToSort[j].getFruitAttribute(sortFieldIndex)).
                        compareTo(arrayToSort[j-1].getFruitAttribute(sortFieldIndex)) < 0)
                    Swap(arrayToSort, j, j-1);
            }
        }
    }
        
        
    private void Swap(Fruit[] arrayToSort, int indexOfLesserValue, int indexOfLargerValue)
    {
        Fruit temp = arrayToSort[indexOfLesserValue];
        arrayToSort[indexOfLesserValue] = arrayToSort[indexOfLargerValue];
        arrayToSort[indexOfLargerValue] = temp;
    }
}
