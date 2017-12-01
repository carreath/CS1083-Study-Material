
/**
 *
 * @author Eltaher
 */
public class Simple1DArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Loop prints the elements of 1D numberArray array forward 1 to 10.
        for (int forward = 0; forward < numberArray.length; forward++)
            System.out.print(numberArray[forward] + "     ");
        
        System.out.println();
        
        // Loop prints the elements of 1D numberArray array backwards 10 to 1.
        for (int backward = 9; backward > -1; backward--)
            System.out.print(numberArray[backward] + "     ");
        
        System.out.println();
    }
    
}
