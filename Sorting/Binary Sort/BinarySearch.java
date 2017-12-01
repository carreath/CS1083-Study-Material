
/**
 *
 * @author Eltaher
 */
public class BinarySearch {
    
    public int Perform_Binary_Search(int[] arrayToSearch, int targetValue)
    {
        int min = 0, max = arrayToSearch.length - 1, mid = 0;
        boolean found = false;
        while (!found && min <= max) {
            mid = (min + max) / 2;
            if (arrayToSearch[mid] == targetValue)
                found = true;
            else if (targetValue < arrayToSearch[mid])
                max = mid - 1;
            else
                min = mid + 1;
        }
        
        if (found)
            return mid;
        else
            return -1;
    }
    
}
