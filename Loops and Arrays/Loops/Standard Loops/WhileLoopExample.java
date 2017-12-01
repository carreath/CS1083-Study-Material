
/**
 *
 * @author Eltaher
 */
public class WhileLoopExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row = 0, col, tab;
        while (row < 10) 
        {
          
            tab = 0;
            while (tab < row)
            {
                System.out.print(" ");
                tab++;
            }
            
            col = row;
            while (col < 10)
            {
              System.out.print("*");
              col++;
            }
            
            System.out.println();
            row++;
        }
    }
    
}
