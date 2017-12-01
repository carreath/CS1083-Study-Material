
/**
 *
 * @author Eltaher
 */
public class Integer_LinkedList {
    
    private Node head;
    private Node tail;
    
    private int count;
    
    public Integer_LinkedList()
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
            tail = tail.next = node;
        }
        
        count++;
        
        return searchedNodes;
    }    
    
    
    public String getFirst()
    {
        if (head != null && this.size() > 0)
            return "The first value in the linkedlist = " + head.getValue() + 
                    "\tand the number of nodes searched to find this value = 1";
        else
            return "The list is empty";
    }
    
    
    public String getLastUsingHead()
    {
        if (head != null && this.size() > 0)
        {
            int searchedNodes = 0;
            Node current;
            current = head;
            searchedNodes++;
            while (current.next != null) {
                searchedNodes++;
                current = current.next;
            }
            
            return "The last value in the linkedlist = " + current.getValue() + 
                    "\tand the number of nodes searched to find this value = " + searchedNodes;
        }
        else
            return "The list is empty";
    }    
    
    
    public String getLastUsingTail()
    {
        if (tail != null && this.size() > 0)
            return "The last value in the linkedlist = " + tail.getValue() + 
                    "\tand the number of nodes searched to find this value = 1";
        else
            return "The list is empty";
    }        

    
    
    // This is for doubly linkedlist.
//    public String get(int index)
//    {
//        
//        if (index >= 0 && index < this.size())
//        {
//            Node current;
//            String result = "";
//            if (index > (this.size()/2)) {
//                result = "Traversing from the tail back.";
//                current = tail;
//                if (index < (this.size() - 1)) {
//                    for (int i = this.size() - 1; i > 0; i--)
//                        current = current.next;
//                }
//            }
//            else {
//                result = "Traversing from the head forth.";
//                current = head;
//                if (index > 0) {
//                    for (int i = 1; i <= index && i < this.size(); i++)
//                        current = current.next;
//                }
//            }
//        
//            return result += current.getValue();
//        }
//        else
//            return "Index outside of the bounds of the LinkedList.";
//    }
    
    
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
       
       public Node(int value)
       {
           intValue = value;
           next = null;
       }
       
       public int getValue()
       {
           return intValue;
       }
    }
    
}
