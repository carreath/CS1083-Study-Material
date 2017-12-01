
/**
 *
 * @author Eltaher
 */
public class BinaryNumbersList_Management {
    
    private static BinaryNumbersList bNList = new BinaryNumbersList();
    
    public static void add(int decimalNumber)
    {
        bNList.add(decimalNumber);
    }
    
    public static void listAllNumbers()
    {
        System.out.println("Decimal Number\t\tBinary Representation");
        System.out.println("--------------------------------------------------"); 
        for (int i = 0; i < bNList.size(); i++)
             System.out.println(bNList.get(i));
    }
        
    
}
