
/**
 *
 * @author Eltaher
 */
public class RecursiveOddEvenPrintingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        OddEvenPrinting(1);
        
    }
    
    
    public static void OddEvenPrinting(int currentValue)
    {
        System.out.println(currentValue);
        
        if (currentValue == 49) {
            currentValue = 0;
            System.out.println();
        }
        
        currentValue = currentValue + 2;

        if (currentValue <= 50)
            OddEvenPrinting(currentValue);
        
    }
    
}
