
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4Loops {
    
    public static void Solve_Towers_Problem(int[][] peg) throws Exception
    {
        int lastTargetPeg = -1;
        while (peg[0][0] > 0 || peg[0][1] > 0)
        {
            Print_Towers(peg);
            System.out.println("-------------------");

            int diskValue;
            if (lastTargetPeg != 0 && peg[0][0] > 0 && 
                (peg[0][1] == 0 || peg[0][0] < peg[0][1]) && ((peg[0][1] - peg[0][0]) != 2))
            {
                diskValue = peg[0][0];
                Remove_Disk_From_Peg(peg, 0);
                Add_Disk_To_Peg(peg, 1, diskValue);
                lastTargetPeg = 1;
            }
            else if (lastTargetPeg != 0 && peg[0][0] > 0 &&
                     (peg[0][2] == 0 || peg[0][0] < peg[0][2]) && ((peg[0][2] - peg[0][0]) != 2))
            {
                diskValue = peg[0][0];
                Remove_Disk_From_Peg(peg, 0);
                Add_Disk_To_Peg(peg, 2, diskValue);  
                lastTargetPeg = 2;
            }
            else if (lastTargetPeg != 1 && peg[0][1] > 0 &&
                     (peg[0][2] == 0 || peg[0][1] < peg[0][2]) && ((peg[0][2] - peg[0][1]) != 2))
            {
                diskValue = peg[0][1];
                Remove_Disk_From_Peg(peg, 1);
                Add_Disk_To_Peg(peg, 2, diskValue);
                lastTargetPeg = 2;
            }
            else if (lastTargetPeg != 1 && peg[0][1] > 0 &&
                     (peg[0][0] == 0 || peg[0][1] < peg[0][0]) && ((peg[0][0] - peg[0][1]) != 2))
            {
                diskValue = peg[0][1];
                Remove_Disk_From_Peg(peg, 1);
                Add_Disk_To_Peg(peg, 0, diskValue);
                lastTargetPeg = 0;                
            }
            else if (lastTargetPeg != 2 && peg[0][2] > 0 &&
                     (peg[0][0] == 0 || peg[0][2] < peg[0][0]) && ((peg[0][0] - peg[0][2]) != 2))
            {
                diskValue = peg[0][2];
                Remove_Disk_From_Peg(peg, 2);
                Add_Disk_To_Peg(peg, 0, diskValue);
                lastTargetPeg = 0;
            }
            else if (lastTargetPeg != 2 && peg[0][2] > 0 &&
                     (peg[0][1] == 0 || peg[0][2] < peg[0][1]) && ((peg[0][1] - peg[0][2]) != 2))
            {
                diskValue = peg[0][2];
                Remove_Disk_From_Peg(peg, 2);
                Add_Disk_To_Peg(peg, 1, diskValue); 
                lastTargetPeg = 1;
            }
                
        }
        
        Print_Towers(peg);
    }
    
      
    public static void Add_Disk_To_Peg(int[][] peg, int col, int diskValue) throws Exception
    {
        for (int row = peg.length - 1; row > 0; row--)
        {
            if (peg[row][col] == 0 && peg[row-1][col] > 0)
                peg[row][col] = peg[row-1][col];
            
            peg[row-1][col] = 0;
        }

        peg[0][col] = diskValue;
    }
    
    
    public static void Remove_Disk_From_Peg(int[][] peg, int col) throws Exception
    {
        for (int row = 1; row < peg.length; row++)
        {        
            if (peg[row][col] > 0)
            {
                peg[row-1][col] = peg[row][col];
                peg[row][col] = 0;
            }
            else
                peg[row-1][col] = 0;
        }
    }    
    
    
    public static void Print_Towers(int[][] peg) throws Exception
    {
        for (int row = 0; row < peg.length; row++)
        {   
            for (int col = 0; col < peg[row].length; col++)
                System.out.print(peg[row][col] + "        ");

            System.out.println();
        }
                
    }
}
