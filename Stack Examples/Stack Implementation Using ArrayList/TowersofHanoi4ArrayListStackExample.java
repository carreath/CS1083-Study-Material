
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4ArrayListStackExample {

    /**
     * @param args the command line arguments
     */
    static ArrayListStack peg1 = new ArrayListStack();
    static ArrayListStack peg2 = new ArrayListStack();
    static ArrayListStack peg3 = new ArrayListStack();
    public static void main(String[] args) {

        try {

            Initial_Disk_Placement(4);

            TowersofHanoi4UsingArrayListStack.Solve_Towers_Problem(-1);
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
