
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4CustomLinkedListStackExample {

    /**
     * @param args the command line arguments
     */
    static CustomLinkedListStack peg1 = new CustomLinkedListStack();
    static CustomLinkedListStack peg2 = new CustomLinkedListStack();
    static CustomLinkedListStack peg3 = new CustomLinkedListStack();
    public static void main(String[] args) {

        try {

            Initial_Disk_Placement(4);

            TowersofHanoi4UsingCustomLinkedListStack.Solve_Towers_Problem(-1);
            
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