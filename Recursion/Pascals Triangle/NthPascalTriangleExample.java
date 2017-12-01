
/**
 *
 * @author Eltaher
 */
public class NthPascalTriangleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            
            /* The size of the aray can be changed from 1 to 50 and the program should work fine.
                The only thing that must be adhered to is that the number of raws must always equal
                to the number of columns. */
            long[][] intArray = new long[9][9];

            NthPascalTriangle pTriangle = new NthPascalTriangle();
        
            pTriangle.Build_Triangle(intArray, 0, intArray.length - 1);
            
            long largestValue = intArray[intArray.length - 1][intArray.length/2];
            
            pTriangle.Print_Array(intArray, 0, largestValue);
        }
        catch (Exception exp)
        {
            System.out.println("Error performing recursive method calls!\n\n" + exp);
        }               
    }
}
