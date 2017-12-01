
import java.util.TimerTask;

/**
 *
 * @author Eltaher
 */
public class QueueManipulationTask extends TimerTask {
    
    protected final QueueDataFeed QDF;
    
    //--- Create an instance of the QueueDataFeed task and store a reference to 
    //    the QDF object to run its "Timed" functions Add_Data and Consume_Date ---
    
    public QueueManipulationTask(QueueDataFeed QDF)
    {
        this.QDF = QDF;
    }
    
    @Override
    public void run(){}
    
}
