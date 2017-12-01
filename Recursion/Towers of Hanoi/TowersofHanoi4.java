
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4 {
    
    public static void Solve_Towers_Problem(int[][] peg, int lastTargetPeg) throws Exception
    {
        Print_Towers(peg, 0, 0);
        System.out.println("-------------------");

        int diskValue;
        if (lastTargetPeg != 0 && peg[0][0] > 0 && 
            (peg[0][1] == 0 || peg[0][0] < peg[0][1]) && ((peg[0][1] - peg[0][0]) != 2))
        {
            diskValue = peg[0][0];
            Remove_Disk_From_Peg(peg, 1, 0);
            Add_Disk_To_Peg(peg, peg.length-1, 1, diskValue);
            lastTargetPeg = 1;
        }
        else if (lastTargetPeg != 0 && peg[0][0] > 0 &&
                 (peg[0][2] == 0 || peg[0][0] < peg[0][2]) && ((peg[0][2] - peg[0][0]) != 2))
        {
            diskValue = peg[0][0];
            Remove_Disk_From_Peg(peg, 1, 0);
            Add_Disk_To_Peg(peg, peg.length-1, 2, diskValue);  
            lastTargetPeg = 2;
        }
        else if (lastTargetPeg != 1 && peg[0][1] > 0 &&
                 (peg[0][2] == 0 || peg[0][1] < peg[0][2]) && ((peg[0][2] - peg[0][1]) != 2))
        {
            diskValue = peg[0][1];
            Remove_Disk_From_Peg(peg, 1, 1);
            Add_Disk_To_Peg(peg, peg.length-1, 2, diskValue);
            lastTargetPeg = 2;
        }
        else if (lastTargetPeg != 1 && peg[0][1] > 0 &&
                 (peg[0][0] == 0 || peg[0][1] < peg[0][0]) && ((peg[0][0] - peg[0][1]) != 2))
        {
            diskValue = peg[0][1];
            Remove_Disk_From_Peg(peg, 1, 1);
            Add_Disk_To_Peg(peg, peg.length-1, 0, diskValue);
            lastTargetPeg = 0;                
        }
        else if (lastTargetPeg != 2 && peg[0][2] > 0 &&
                 (peg[0][0] == 0 || peg[0][2] < peg[0][0]) && ((peg[0][0] - peg[0][2]) != 2))
        {
            diskValue = peg[0][2];
            Remove_Disk_From_Peg(peg, 1, 2);
            Add_Disk_To_Peg(peg, peg.length-1, 0, diskValue);
            lastTargetPeg = 0;
        }
        else if (lastTargetPeg != 2 && peg[0][2] > 0 &&
                 (peg[0][1] == 0 || peg[0][2] < peg[0][1]) && ((peg[0][1] - peg[0][2]) != 2))
        {
            diskValue = peg[0][2];
            Remove_Disk_From_Peg(peg, 1, 2);
            Add_Disk_To_Peg(peg, peg.length-1, 1, diskValue); 
            lastTargetPeg = 1;
        }
                
        if (peg[0][0] > 0 || peg[0][1] > 0)
            Solve_Towers_Problem(peg, lastTargetPeg);
        else
            Print_Towers(peg, 0, 0);
    }
    
      
    public static void Add_Disk_To_Peg(int[][] peg, int row, int col, int diskValue) throws Exception
    {
        if (row > 0 && row < peg.length)
        {
            if (peg[row][col] == 0 && peg[row-1][col] > 0)
            {
                peg[row][col] = peg[row-1][col];
                
            }
            
            peg[row-1][col] = 0;
            row--;
            if (row > 0)
                Add_Disk_To_Peg(peg, row, col, diskValue);
        }

        peg[0][col] = diskValue;
    }
    
    
    public static void Remove_Disk_From_Peg(int[][] peg, int row, int col) throws Exception
    {
        if (row > 0 && row < peg.length)
        {
            if (peg[row][col] > 0)
            {
                peg[row-1][col] = peg[row][col];
                peg[row][col] = 0;
                row++;
                if (row < peg.length)
                    Remove_Disk_From_Peg(peg, row, col);
            }
            else
                peg[row-1][col] = 0;
        }
    }    
    
    
    public static void Print_Towers(int[][] peg, int row, int col) throws Exception
    {
        System.out.print(peg[row][col] + "        ");
        col++;
        if (col < peg[row].length)
            Print_Towers(peg, row, col);
        else
        {
            System.out.println();
            col = 0;
            row++;
            if (row < peg.length)
                Print_Towers(peg, row, col);
        }
                
    }
}
