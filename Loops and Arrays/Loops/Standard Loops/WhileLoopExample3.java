
/**
 *
 * @author Eltaher
 */
public class WhileLoopExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row = 0, col, tab;
        while (row < 10)
        {
            if (row < 5)
            {
                tab = 4;
                while (tab > row)
                {
                    System.out.print(" ");
                    tab--;
                }
            
                col = 0;
                while (col < ((row * 2) + 1))
                {
                    System.out.print("*");
                    col++;
                }
            }
            else
            {
                tab = (row - 5);
                while (tab > 0)
                {
                    System.out.print(" ");
                    tab--;
                }
                
                col = 9;
                while (col > ((row - 5) * 2))
                {
                    System.out.print("*");
                    col--;
                }
            }
            
            System.out.println();
            row++;
        }
    }
    
}
