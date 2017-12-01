
/**
 *
 * @author Eltaher
 */
public class WhileLoopExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row = 0, col, tab;
        while (row < 10)
        {
            tab = 9;
            while(tab > row)
            {
                System.out.print(" ");
                tab--;
            }
            
            col = 0;
            while (col <= row)
            {
                System.out.print("*");
                col++;
            }

            System.out.println();
            row++;
        }
    }
    
}
