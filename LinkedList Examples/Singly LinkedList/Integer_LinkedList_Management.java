
/**
 *
 * @author Eltaher
 */
public class Integer_LinkedList_Management {
    
    private static Integer_LinkedList iLList = new Integer_LinkedList();
    
    public static void addFromHead(int value)
    {
        System.out.println("The number of nodes traversed = " + iLList.addUsingHead(value));
    }
    
    
    public static void addFromTail(int value)
    {
        System.out.println("The number of nodes traversed = " + iLList.addUsingTail(value));
    }
    
    
    public static String getFirst()
    {
        if (iLList.size() > 0)
            return iLList.getFirst();
        else
            return null;
    }
    
    public static String getLastFromHead()
    {
        if (iLList.size() > 0)
            return iLList.getLastUsingHead();
        else
            return null;
    }  
    
    
    public static String getLastFromTail()
    {
        if (iLList.size() > 0)
            return iLList.getLastUsingTail();
        else
            return null;
    }  
        
      // This works with doubly linkelist
//    public static String get(int index)
//    {
//        if (index >= 0 && index < iLList.size())
//            return iLList.get(index);
//        else
//            return null;
//    }  
    
    
    public static void listAllValues()
    {
        System.out.println("Value");
        System.out.println("------");        
        for (int i = 0; i < iLList.size(); i++)
             System.out.print(iLList.getAll(i) + "  ");
    }
    
}
