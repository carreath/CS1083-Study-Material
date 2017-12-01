
/**
 *
 * @author Eltaher
 */
public class LinearSearch {
    
    public int Perform_Linear_Search(int[] arrayToSearch, int targetValue)
    {
        int index = -1;
        for (int i = 0; i < arrayToSearch.length; i++)
        {
            if (targetValue == arrayToSearch[i])
            {
                index = i;
                i = arrayToSearch.length;
            }
        }
        
        return index;
    }
}
