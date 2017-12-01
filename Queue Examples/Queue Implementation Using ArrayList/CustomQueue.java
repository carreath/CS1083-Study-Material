
import java.util.ArrayList;

/**
 *
 * @author Eltaher
 */
public class CustomQueue {
    
    private ArrayList<Object> myQueue = new ArrayList();
    
    public void Enqueue(Object obj)
    {
        myQueue.add(obj);
    }
    
    public Object Dequeue()
    {
        Object obj = myQueue.get(0);
        myQueue.remove(0);
        
        return obj;
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
