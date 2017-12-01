
import java.util.Stack;

/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4StackExample {

    /**
     * @param args the command line arguments
     */
    static Stack peg1 = new Stack();
    static Stack peg2 = new Stack();
    static Stack peg3 = new Stack();
    public static void main(String[] args) {

        try {

            Initial_Disk_Placement(4);

            TowersofHanoi4UsingStack.Solve_Towers_Problem(-1);
        }
        catch (Exception exp)
        {
            System.out.printf("Exception occured!\n\n", exp);
            exp.printStackTrace();
        }
            
    }
    
    
    public static void Initial_Disk_Placement(int diskValue)
    {
        peg1.push(diskValue);
        diskValue--;
        if (diskValue > 0)
            Initial_Disk_Placement(diskValue);
    }
    
}
