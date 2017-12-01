
/**
 *
 * @author Eltaher
 */
public class CustomLinkedListQueue {
    
    private CustomLinkedListForQueueImplementation myQueue = 
            new CustomLinkedListForQueueImplementation();
    
    public void Enqueue(Object obj)
    {
        myQueue.add(obj);
    }
    
    public Object Dequeue()
    {
        return myQueue.remove();
    }
    
    
    public Object elementAt(int index)
    {
        return myQueue.get(index);
    }
    
    
    public int size()
    {
        return myQueue.size();
    }
    
    
    public boolean empty()
    {
        return (myQueue.isEmpty());
    }
    
}
