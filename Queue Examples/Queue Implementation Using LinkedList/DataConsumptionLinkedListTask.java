
//import java.util.TimerTask;

/**
 *
 * @author Eltaher
 */
public class DataConsumptionLinkedListTask extends QueueManipulationLinkedListTask {
    

    public DataConsumptionLinkedListTask(QueueDataFeedLinkedList QDF)
    {
        super(QDF);
    }

    
//--  Run Consume_Data function of the QDF object every 5 seconds  --
    
    @Override
    public void run() {

        if (QDF != null)
            QDF.Consume_Data();
    }
}

