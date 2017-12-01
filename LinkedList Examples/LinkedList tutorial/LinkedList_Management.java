
import java.util.LinkedList;

/**
 *
 * @author Eltaher
 */
public class LinkedList_Management {
    
    private static LinkedList<President> lList = new LinkedList();
    
    public static void addPresident(President p)
    {
        lList.add(p);
    }
    
    public static void insertPresident(President p, int index)
    {
        if (index >= 0 && index < lList.size())
            lList.add(index, p);
    }
    
    public static President getPresident(int index)
    {
        if (index >= 0 && index < lList.size())
            return lList.get(index);
        else
            return null;
    }
    
    public static President getFirstPresident()
    {
        if (lList.size() > 0)
            return lList.getFirst();
        else
            return null;
    }
    
    public static President getLastPresident()
    {
        if (lList.size() > 0)
            return lList.getLast();
        else
            return null;
    }  
    
    public static President getByPresidentName(String name)
    {
        for (int i = 0; i < lList.size(); i++)
        {
            if (lList.get(i).getName().compareToIgnoreCase(name) == 0)
                return lList.get(i);
        }

        return null;
    }    
        
    public static void removePresident(int index)
    {
        if (index >= 0 && index < lList.size())
            lList.remove(index);
    }    
    
    
    public static void removePresident(President p)
    {
        lList.remove(p);
    }        
    
    
    public static String presidentToString(int index)
    {
        if (index >= 0 && index < lList.size())
            return lList.get(index).toString();
        else
            return "Index is out of the bound of the LinkedList.";
    }
    
    
    public static void listAllPresidents()
    {
        System.out.println("Name\t\t\t\tPeriod");
        System.out.println("-----------------------------------------");        
        for (int i = 0; i < lList.size(); i++)
             System.out.println(lList.get(i).toString());
    }
    
}
