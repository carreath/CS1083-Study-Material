
import java.util.Random;

/**
 *
 * @author Eltaher
 */
public class QueueDataFeedLinkedList {
    
    private Random rand = new Random();
    private CustomLinkedListQueue queue = new CustomLinkedListQueue();
    
    public void Add_Data()
    {
        if (queue.size() < 16)
            queue.Enqueue(rand.nextInt(1000));
    }
    
    
    public void Show_Queue_Contents()
    {
        System.out.println();
        System.out.println("---------------------------------------------" +
                           "----------------------------------------------");
        System.out.print("| ");
        for (int i = 0; i < queue.size(); i++)
        {
            System.out.print(queue.elementAt(i));
            System.out.print(" | ");
        }
        System.out.println();
        System.out.println("---------------------------------------------" +
                           "----------------------------------------------");        
    }
    
    
    public void Consume_Data()
    {
        if (queue.size() > 1)
        {
            queue.Dequeue();
            Show_Queue_Contents();
        }
    }

}