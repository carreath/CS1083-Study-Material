
/**
 *
 * @author Eltaher
 */
public class CustomLinkedListForQueueImplementation {
    
    private Node head;
    private Node tail;
    private int nodeCount;
    
    public CustomLinkedListForQueueImplementation()
    {
        head = tail = null;
        nodeCount = 0;
    }
    
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    
    public int size()
    {
        return nodeCount;
    }
    
    
    public void add(Object obj)
    {
        Node node = new Node(obj);
        
        if (head == null) {
            head = tail = node;
        }
        else {
            tail = tail.next = node;
        }
        
        nodeCount++;
    }    
    
    
    
    public Object get(int index)
    {
        if (index >= 0 && index < this.size())
        {
            Node current = head;
            if (index > 0) {
                for (int i = 1; i <= index && i < this.size(); i++)
                    current = current.next;
            }
        
            return current.value;
        }
        else
            return null;
    }
    
    
    public Object remove()
    {
        Object removedValue = null;
        if (head != null)
        {
            removedValue = head;
            head = head.next;
            nodeCount--;
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