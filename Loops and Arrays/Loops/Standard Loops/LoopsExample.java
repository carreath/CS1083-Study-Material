
/**
 *
 * @author Eltaher
 */
public class LoopsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int row = 0; row < 10; row++)
        {
            for (int tab = 0; tab < row; tab++)
                System.out.print(" ");
            
            for (int col = row; col < 10; col++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
