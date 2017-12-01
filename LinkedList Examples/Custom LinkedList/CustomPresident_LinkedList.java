
/**
 *
 * @author Eltaher
 */
public class CustomPresident_LinkedList {
    
    private PresidentNode list;
    private int nodeCount;
    
    public CustomPresident_LinkedList()
    {
        list = null;
        nodeCount = 0;
    }
    
    
    public int size()
    {
        return nodeCount;
    }
    
    
    public void add(CustomPresident p)
    {
        PresidentNode node = new PresidentNode(p);
        PresidentNode current;
        
        if (list == null)
            list = node;
        else {
            current = list;
            while (current.next != null) 
                current = current.next;
            
            current.next = node;
        }
        
        nodeCount++;
    }
    
    
    public boolean add(CustomPresident p, int index)
    {
        boolean result = false;
        if (index == 0 || ((list != null) && (index > 0 && index < this.size())))
        {
            PresidentNode node = new PresidentNode(p);
            PresidentNode current;
        
            if (list == null) {
                list = node;
                nodeCount++;
                result = true;
            }
            else {
                current = list;
                int counter = 1;
                while (current.next != null && counter < index) 
                {
                    current = current.next;
                    counter++;
                }
            
                if (counter == index) {
                    PresidentNode temp = current.next;
                    current.next = node;
                    node.next = temp;
                    nodeCount++;
                    result = true;
                }
            }
        }
        
        return result;
    }
    
    
    public CustomPresident get(int index)
    {
        if (index >= 0 && index < this.size())
        {
            PresidentNode current = list;
            if (index > 0) {
                for (int i = 1; i <= index && i < this.size(); i++)
                    current = current.next;
            }
        
            return current.president;
        }
        else
            return null;
    }
    
    
    public CustomPresident getFirst()
    {
        if (list != null && this.size() > 0)
            return list.president;
        else
            return null;
    }
    
    
    public CustomPresident getLast()
    {
        if (list != null && this.size() > 0)
        {
            PresidentNode current;
            current = list;
            while (current.next != null) 
                current = current.next;
            
            return current.president;
        }
        else
            return null;
    }
    
    
    public CustomPresident getByName(String name)
    {
        if (list != null && this.size() > 0)
        {
            if (list.president.getName().compareToIgnoreCase(name) == 0)
                return list.president;
            else {
                PresidentNode current = list;
                while (current != null) {
                    if (name.compareToIgnoreCase(current.president.getName()) == 0)
                        return current.president;
                    current = current.next;
                }
            }
        }

        return null;
    }    
    
    
    public boolean remove(int index)
    {
        boolean result = false;
        if (list != null && this.size() > index)
        {
            if (index == 0) {
                list = list.next;
                this.nodeCount--;
                result = true;
            }
            else if (list.next != null) {
                PresidentNode current = list.next,  previous = list;
                
                for (int counter = 1; current != null && counter <= index; counter++)
                {
                    if (index == counter)
                    {
                        previous.next = current.next;
                        this.nodeCount--;
                        result = true;
                    }
                    else
                    {
                        previous = current;
                        current = current.next;
                    }
                }
            }
        }
        
        return result;
    }    
    
    
    public boolean remove(CustomPresident p)
    {
        boolean result = false;
        if (list != null && this.size() > 0)
        {
            if (list.president.equals(p))
            {
                list = list.next;
                this.nodeCount--;
                result = true;                
            }
            else {
                PresidentNode current = list.next, previous = list;
                
                for (int counter = 0; current != null && counter < this.size(); counter++)
                {
                    if (current.president.equals(p))
                    {
                        previous.next = current.next;
                        this.nodeCount--;
                        counter = this.size();
                        result = true;
                    }
                    else
                        previous = current;
                    
                    current = current.next;
                }
            }
        }
        
        return result;
    }    
    
    
    public String toString()
    {
        String result = "";
        
        PresidentNode current = list;
        
        while (current != null) {
            result += current.president + "\n";
            current = current.next;
        }
        
        return result;
    }
    
    private class PresidentNode {
        
        private CustomPresident president;
        private PresidentNode next;
        
        public PresidentNode(CustomPresident president)
        {
            this.president = president;
            next = null;
        }
        
        
        public CustomPresident getPresident()
        {
            return president;
        }     
        
        
        public PresidentNode getNext()
        {
            return next;
        }
        
                
    }
    
}
