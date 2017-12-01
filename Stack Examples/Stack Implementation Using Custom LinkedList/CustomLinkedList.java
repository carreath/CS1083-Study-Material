
/**
 *
 * @author Eltaher
 */
public class CustomLinkedList {
    
    private Node list;
    private int nodeCount;
    
    public CustomLinkedList()
    {
        list = null;
        nodeCount = 0;
    }
    
    
    public boolean isEmpty()
    {
        return (list == null);
    }
    
    
    public int size()
    {
        return nodeCount;
    }
    
    
    public void add(int index, Object obj)
    {
        if (index == 0 || ((list != null) && (index > 0 && index < this.size())))
        {
            Node node = new Node(obj);
            Node current;
        
            if (list == null) {
                list = node;
                nodeCount++;
            }
            else if (index == 0) {
                node.next = list;
                list = node;
                nodeCount++;
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
                    Node temp = current.next;
                    current.next = node;
                    node.next = temp;
                    nodeCount++;
                }
            }
        }
    }
    
    
    public Object get(int index)
    {
        if (index >= 0 && index < this.size())
        {
            Node current = list;
            if (index > 0) {
                for (int i = 1; i <= index && i < this.size(); i++)
                    current = current.next;
            }
        
            return current.value;
        }
        else
            return null;
    }
    
    
    public Object remove(int index)
    {
        Object removedValue = null;
        if (list != null && this.size() > index)
        {
            if (index == 0) {
                removedValue = list.value;
                list = list.next;
                this.nodeCount--;
            }
            else if (list.next != null) {
                Node current = list.next,  previous = list;
                
                for (int counter = 1; current != null && counter <= index; counter++)
                {
                    if (index == counter)
                    {
                        removedValue = current.value;
                        previous.next = current.next;
                        this.nodeCount--;
                    }
                    else
                    {
                        previous = current;
                        current = current.next;
                    }
                }
            }
        }
        
        return removedValue;
    }    
    
    
    private class Node {
        
        private Object value;
        private Node next;
        
        public Node(Object value)
        {
            this.value = value;
            next = null;
        }
        
        
        public Object getValue()
        {
            return value;
        }     
        
        
        public Node getNext()
        {
            return next;
        }
        
                
    }
    
}
    