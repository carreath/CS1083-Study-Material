
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] peg = new int[4][3];
        
        try {

            Initial_Disk_Placement(peg, 0, 1);

            TowersofHanoi4.Solve_Towers_Problem(peg, -1);
        }
        catch (Exception exp)
        {
            System.out.printf("Exception occured!\n\n", exp);
        }
            
    }
    
    
    public static void Initial_Disk_Placement(int[][] peg, int index, int diskValue)
    {
        peg[index][0] = diskValue;
        index++;
        diskValue++;
        if (index < peg.length)
            Initial_Disk_Placement(peg, index, diskValue);
            
    }
    
}
