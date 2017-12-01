
/**
 *
 * @author Eltaher
 */
public class BinarySearch_Recursion {
    
    public int Perform_Binary_Search(int[] arrayToSearch, int targetValue)
    {
        int min = 0, max = arrayToSearch.length - 1, mid = 0;
        return Perform_Splitting_And_Comparison(arrayToSearch, 
                                                    targetValue, min, mid, max);
    }
    
    
    public int Perform_Splitting_And_Comparison(int[] arrayToSearch, 
                                    int targetValue, int min, int mid, int max)
    {
        if (min <= max)
        {
            mid = (min + max) / 2;
            if (arrayToSearch[mid] != targetValue)
            {
                if (targetValue < arrayToSearch[mid])
                    max = mid - 1;
                else
                    min = mid + 1;
                
                mid = Perform_Splitting_And_Comparison(arrayToSearch, 
                                                    targetValue, min, mid, max);
            }
        }
        else
            mid = -1;
        
        return mid;
    }    
    
    
}
