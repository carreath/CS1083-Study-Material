
/**
 *
 * @author Eltaher
 */
public class NthPascalTriangleLoops {
    
    public void Build_Triangle(long intArray[][])
    {
        for (int row = 0; row < intArray.length; row++)
        {
            intArray[row][0] = 1;
            if (row > 0)
                intArray[row][row] = 1;
                
            if (row > 1)
                Sum_Top_Two_Values(intArray, row);
        }
    }
    

    public void Sum_Top_Two_Values(long intArray[][], int row)
    {
        for (int col = 1; col < row; col++)
             intArray[row][col] = intArray[row-1][col-1] + intArray[row-1][col];
    }
    
    
    public void Print_Array(long intArray[][], long largestValue)
    {
        for (int row = 0; row < intArray.length; row++)
        {
            Print_Space(intArray, row, largestValue);
            Print_Columns(intArray, row, largestValue);   
        }
    }
    
    
    public void Print_Space(long intArray[][], int row, long largestValue)
    {
        for (int col = 0; col < intArray[row].length; col++)
        {
            if (col < ((intArray[row].length - 1) - row))
            {
                char[] pos = String.valueOf(largestValue).toCharArray();
                Print_Padding_Spaces(pos.length);
            }
        }
    }
    

    public void Print_Columns(long intArray[][], int row, long largestValue)
    {
        for (int col = 0; col < intArray[row].length; col++)
        {
            if (intArray[row][col] > 0)
            {
                char[] pos = String.valueOf(largestValue).toCharArray();
                char[] pos2 = String.valueOf(intArray[row][col]).toCharArray();
                System.out.print(intArray[row][col]);
                Print_Padding_Spaces(pos.length + (pos.length - pos2.length));
            }
          
            if (col == intArray[row].length - 1)
                System.out.println();
        }
    }
    
    // Recursive method used by Print_Spaces method to do the actual space padding.
    public void Print_Padding_Spaces(int paddingSpaces)
    {
        for (int i = paddingSpaces; i > 0; i--)
            System.out.print(" ");
    }
    
}
