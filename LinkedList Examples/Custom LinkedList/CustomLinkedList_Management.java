
/**
 *
 * @author Eltaher
 */
public class CustomLinkedList_Management {
    
    private static CustomPresident_LinkedList pLList = new CustomPresident_LinkedList();
    
    public static void addPresident(CustomPresident p)
    {
        pLList.add(p);
    }
    
    public static void insertPresident(CustomPresident p, int index)
    {
        boolean result = false;
        if (index >= 0 && index < pLList.size())
            result = pLList.add(p, index);
        if (!result)
            System.out.println("Invalid index provided.");
    }
    
    public static CustomPresident getPresident(int index)
    {
        if (index >= 0 && index < pLList.size())
            return pLList.get(index);
        else
            return null;
    }
    
    public static CustomPresident getFirstPresident()
    {
        if (pLList.size() > 0)
            return pLList.getFirst();
        else
            return null;
    }
    
    public static CustomPresident getLastPresident()
    {
        if (pLList.size() > 0)
            return pLList.getLast();
        else
            return null;
    }  
    
    public static CustomPresident getByPresidentName(String name)
    {
        return pLList.getByName(name);
    }    
        
    public static void removePresident(int index)
    {
            pLList.remove(index);
    }    
    
    
    public static void removePresident(CustomPresident p)
    {
        pLList.remove(p);
    }        
    
    
    public static String presidentToString(int index)
    {
        if (index >= 0 && index < pLList.size())
            return pLList.get(index).toString();
        else
            return "Index is out of the bound of the LinkedList.";
    }
    
    
    public static void listAllPresidents()
    {
        System.out.println("Name\t\t\t\tPeriod");
        System.out.println("-----------------------------------------");        
        for (int i = 0; i < pLList.size(); i++)
             System.out.println(pLList.get(i).toString());
    }
    
}
