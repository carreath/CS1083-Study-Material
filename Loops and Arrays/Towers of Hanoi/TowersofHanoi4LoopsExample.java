
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4LoopsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] peg = new int[4][3];
        
        try {

            Initial_Disk_Placement(peg);

            TowersofHanoi4Loops.Solve_Towers_Problem(peg);
        }
        catch (Exception exp)
        {
            System.out.printf("Exception occured!\n\n", exp);
        }
            
    }
    
    
    public static void Initial_Disk_Placement(int[][] peg)
    {
        for (int index = 0; index < peg.length; index++)
             peg[index][0] = index+1;
    }
    
}
