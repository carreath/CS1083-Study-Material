
/**
 *
 * @author Eltaher
 */
public class DataFeedLinkedListTask extends QueueManipulationLinkedListTask {
    
//--------  Create an instance of the QueueDataFeedLinkedList task and store a reference to 
//          the QDF object to run its "Timed" function Add_Data  ---------
    
//    private final QueueDataFeedLinkedList QDF;
    
    public DataFeedLinkedListTask(QueueDataFeedLinkedList QDF)
    {
        super(QDF);
    }

    
//--  Run Add_Data function of the QDF object every 1 second  --
    
    @Override
    public void run() {

        if (QDF != null)
            QDF.Add_Data();
    }
}

