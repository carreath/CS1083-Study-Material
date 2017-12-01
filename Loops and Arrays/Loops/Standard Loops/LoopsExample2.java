
/**
 *
 * @author Eltaher
 */
public class LoopsExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int row = 0; row < 10; row++)
        {
            for (int tab = 9; tab > row; tab--)
                System.out.print(" ");
            
            for (int col = 0; col <= row; col++)
                 System.out.print("*");
            
            System.out.println();
        }
    }
}
