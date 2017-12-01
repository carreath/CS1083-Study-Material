
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class BinarySearchRecursionExample {

    /**
     * @param args the command line arguments
     */
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int[] intList = {11,23,17,43,28,19,50,21,42,24,29,3,14,6,15,36,46,4,39,
                         26,10,33,44,22,1,9,20,30,40,7};
        
        Invoke_Recursive_Binary_Search(intList);
    }
    
    
    
    public static void Invoke_Recursive_Binary_Search(int[] intList)
    {
        System.out.println("The unsorted list is:");
        Print_Array_Recursively(intList, 0);
        System.out.println();
        
        CustomInsertionSort_Recursion insrSort = new CustomInsertionSort_Recursion();
        insrSort.Perform_Insertion_Sort(intList, 0);
        
        BinarySearch_Recursion bSearch = new BinarySearch_Recursion();
        Search_Value_Entry(intList, bSearch);
     }

    
    public static void Search_Value_Entry(int[] intList, BinarySearch_Recursion bSearch)
    {
        int target = 0, index;
        
        try {
            System.out.println();
            System.out.println("Recursive Binary search example...");
            System.out.print("Enter a value between 1-50 to search for, or 0 to exit: ");
            target = scan.nextInt();
            scan.nextLine();
            System.out.println();
            
            if (target < 0 || target > 50)
                System.out.println("Only integers between 0-50 are acceptable!");
            else if (target > 0)
            {
                System.out.println("The sorted list using Recursion is:");
            
                Print_Array_Recursively(intList, 0);
            
                System.out.println();
                System.out.println();

                index = bSearch.Perform_Binary_Search(intList, target);
                
                if (index > -1)
                    System.out.println("The number (" + target + ") was found in the list at location(" + (index + 1) + ").");
                else 
                    System.out.println("The number (" + target + ") was not found in the list.");
            }
        
            if (target != 0)
                Search_Value_Entry(intList, bSearch);
        }
        catch (InputMismatchException exp1)
        {
            System.out.println("Check your input. Only numeric values between 0 and 50 are valid.\n\n" + exp1);
        }
        catch (Exception exp)
        {
            System.out.println("An exception was thrown by the progarm.\n\n" + exp);
        }
    }
    

    public static void Print_Array_Recursively(int[] intList, int index)
    {
        if (index >= 0 && index < intList.length)
        {
            System.out.print("  " + intList[index]);
            index++;
            if (index < intList.length)
                Print_Array_Recursively(intList, index);
        }
        
    }
}

