
/**
 *
 * @author Eltaher
 */
public class CustomLinkedListStack {
    
    private CustomLinkedList myStack = new CustomLinkedList();
    
    public void push(Object item) throws Exception
    {
        myStack.add(0, item);
    }
    
    public Object pop() throws Exception
    {
        return myStack.remove(0);
    }
    
    public Object peek() throws Exception
    {
        return myStack.get(0);
    }
    
    public Object elementAt(int index) throws Exception
    {
        return myStack.get(index);
    }
    
    public int size()
    {
        return myStack.size();
    }
    
    public boolean empty()
    {
        return myStack.isEmpty();
    }
    
}
