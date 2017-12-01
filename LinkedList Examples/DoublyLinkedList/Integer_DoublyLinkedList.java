
/**
 *
 * @author Eltaher
 */
public class Integer_DoublyLinkedList {
    
    private Node head;
    private Node tail;
    
    private int count;
    
    public Integer_DoublyLinkedList()
    {
        head = tail = null;
        count = 0;
    }
    
    
    public int size()
    {
        return count;
    }
    
    
    public int addUsingHead(int value)
    {
        Node node = new Node(value);
        Node current;
        
        int searchedNodes = 0;
        
        if (head == null)
            head = tail = node;
        else {
            searchedNodes++;
            current = head;
            while (current.next != null) {
                searchedNodes++;
                current = current.next;
            }
            
            current.next = tail = node;
            node.previous = current;
        }
        
        count++;
        
        return searchedNodes;
    }
    
    
    public int addUsingTail(int value)
    {
        Node node = new Node(value);
        
        int searchedNodes = 0;
        
        if (head == null) {
            head = tail = node;
        }
        else {
            searchedNodes++;
            node.previous = tail;
            tail = tail.next = node;
        }
        
        count++;
        
        return searchedNodes;
    }    
    
 
    public String get(int index)
    {
        if (index >= 0 && index < this.size())
        {
            Node current;
            int searchedNodes = 1;
            String result = "";
            if (index > (this.size()/2)) {
                result = "Traversing from the tail back.";
                current = tail;
                if (index < (this.size() - 1)) {
                    for (int i = this.size() - 1; i > 0 && i > index; i--) {
                        searchedNodes++;
                        current = current.previous;
                    }
                }
            }
            else {
                result = "Traversing from the head forth.";
                current = head;
                if (index > 0) {
                    for (int i = 1; i <= index && i < this.size(); i++) {
                        searchedNodes++;
                        current = current.next;
                    }
                }
            }
        
            return result += " Nodes traversed = " + searchedNodes + 
                              ". The value at index (" + index + ") = " + current.getValue();
        }
        else
            return "Index outside of the bounds of the doubly linked list.";
    }
    
    
    public int getAll(int index)
    {
        
        if (index >= 0 && index < this.size())
        {
            Node current = head;
            if (index > 0) {
                for (int i = 1; i <= index && i < this.size(); i++)
                     current = current.next;
            }

            return current.getValue();
        }
        else
            return -1;
    }
    
    

    private class Node {
       private int intValue;
       private Node next;
       private Node previous;
       
       public Node(int value)
       {
           intValue = value;
           next = previous = null;
       }
       
       public int getValue()
       {
           return intValue;
       }
    }
    
}
