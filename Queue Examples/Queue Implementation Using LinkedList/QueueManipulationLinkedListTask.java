
import java.util.TimerTask;

/**
 *
 * @author Eltaher
 */
public class QueueManipulationLinkedListTask extends TimerTask {
    
    protected final QueueDataFeedLinkedList QDF;
    
    //--- Create an instance of the QueueDataFeedLinkedList task and store a reference to 
    //    the QDF object to run its "Timed" functions Add_Data and Consume_Date ---
    
    public QueueManipulationLinkedListTask(QueueDataFeedLinkedList QDF)
    {
        this.QDF = QDF;
    }
    
    @Override
    public void run() {
        
    }
    
}
