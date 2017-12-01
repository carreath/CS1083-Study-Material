
/**
 *
 * @author Eltaher
 */
public class NthPascalTriangle {
    
    /* Recursive method for building the triangle and store the values
       in a two dimensional array. */
    public void Build_Triangle(long intArray[][], int row, int max)
    {
        if (row >= 0)
        {
            intArray[row][0] = 1;
            if (row > 0)
                intArray[row][row] = 1;
                
            if (row > 1)
            {
                int col = 1;
                Sum_Top_Two_Values(intArray, row, col);
            }
                
            if (row < max)
            {
                row++;
                Build_Triangle(intArray, row, max);
            }
        }
    }
    
    /* Recursive method to add the two numbers in the above row to get 
       the current number and save it in its proper location in the array.
       The recursion here does this operation for all columns in the given row. */
    public void Sum_Top_Two_Values(long intArray[][], int row, int col)
    {
        intArray[row][col] = intArray[row-1][col-1] + intArray[row-1][col];
        if (col < row)
            Sum_Top_Two_Values(intArray, row, ++col);
            
    }
    
    // Recursive method to print the contents of the two dimensonal array.
    public void Print_Array(long intArray[][], int row, long largestValue)
    {
        Print_Space(intArray, row, 0, largestValue);
        Print_Columns(intArray, row, 0, largestValue);   
        if (row < intArray.length - 1)
            Print_Array(intArray, ++row, largestValue);
    }
    
    
    // Recursive method that prints the spaces before and after the numberic values.
    public void Print_Space(long intArray[][], int row, int col, long largestValue)
    {
        int currentCol = col;
        
        if (currentCol < ((intArray[row].length - 1) - row))
        {
            char[] pos = String.valueOf(largestValue).toCharArray();
                
            Print_Padding_Spaces(pos.length);
            currentCol++;
            if (currentCol < intArray[row].length)
                Print_Space(intArray, row, currentCol, largestValue);
        }
    }
    
    // Recursive method that prints the numeric value in each column per the current row.
    public void Print_Columns(long intArray[][], int row, int col, long largestValue)
    {
        if (row >= 0 && col >= 0 && row < intArray.length &&
            col < intArray[row].length)
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
        
            if (row <= intArray.length - 1)
                Print_Columns(intArray, row, ++col, largestValue);
            else
                System.out.println();
        }

    }
    
    // Recursive method used by Print_Spaces method to do the actual space padding.
    public void Print_Padding_Spaces(int paddingSpaces)
    {
        System.out.print(" ");
        paddingSpaces--;
        if (paddingSpaces > 0)
            Print_Padding_Spaces(paddingSpaces);
            
    }
    
}
