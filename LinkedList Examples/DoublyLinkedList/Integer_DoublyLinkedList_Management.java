
/**
 *
 * @author Eltaher
 */
public class Integer_DoublyLinkedList_Management {
    
    private static Integer_DoublyLinkedList iLList = new Integer_DoublyLinkedList();
    
    public static void addFromHead(int value)
    {
        System.out.println("The number of nodes traversed = " + iLList.addUsingHead(value));
    }
    
    
    public static void addFromTail(int value)
    {
        System.out.println("The number of nodes traversed = " + iLList.addUsingTail(value));
    }
    
    
    public static String get(int index)
    {
        if (index >= 0 && index < iLList.size())
            return iLList.get(index);
        else
            return "Index out of the bounds of the doubly linked list.";
    }  
    
    
    public static void listAllValues()
    {
        System.out.println("Value");
        System.out.println("------");        
        for (int i = 0; i < iLList.size(); i++)
             System.out.print(iLList.getAll(i) + "  ");
    }
    
}
