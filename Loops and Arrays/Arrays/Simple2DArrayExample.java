
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class Simple2DArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String format;
        int[][] monthDays = {{1,2,3,4,5,6,7},
                             {8,9,10,11,12,13,14},
                             {15,16,17,18,19,20,21},
                             {22,23,24,25,26,27,28},
                             {29,30,31}};

        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri","Sat", "Sun"};
        
        format = "%-10s";
        for (int i = 0; i < 7; i++)
            System.out.format(format, weekDays[i]);

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();
         
        for (int row = 0; row < monthDays.length; row++)
        {
            for (int col = 0; col < monthDays[row].length; col++)
                 System.out.format(format, monthDays[row][col]);
            
             System.out.println();
        }
    }
    
}
