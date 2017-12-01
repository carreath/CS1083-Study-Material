
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4LinkedListStackExample {

    /**
     * @param args the command line arguments
     */
    static LinkedListStack peg1 = new LinkedListStack();
    static LinkedListStack peg2 = new LinkedListStack();
    static LinkedListStack peg3 = new LinkedListStack();
    public static void main(String[] args) {

        try {

            Initial_Disk_Placement(4);

            TowersofHanoi4UsingLinkedListStack.Solve_Towers_Problem(-1);
        }
        catch (Exception exp)
        {
            System.out.printf("Exception occured!\n\n", exp);
            exp.printStackTrace();
        }
            
    }
    
    
    public static void Initial_Disk_Placement(int diskValue) throws Exception
    {
        peg1.push(diskValue);
        diskValue--;
        if (diskValue > 0)
            Initial_Disk_Placement(diskValue);
    }
    
}
