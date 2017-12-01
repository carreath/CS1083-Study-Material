
/**
 *
 * @author Eltaher
 */
public class LoopsExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int row = 0; row < 10; row++)
        {
            if (row < 5)
            {
                for (int tab = 4; tab > row; tab--)
                    System.out.print(" ");
            
                for (int col = 0; col < ((row * 2) + 1); col++)
                    System.out.print("*");
            }
            else
            {
                for (int tab = (row - 5); tab > 0; tab--)
                    System.out.print(" ");
            
                for (int col = 9; col > ((row - 5) * 2); col--)
                    System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
