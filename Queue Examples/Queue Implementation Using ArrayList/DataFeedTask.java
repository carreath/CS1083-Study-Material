
/**
 *
 * @author Eltaher
 */
public class DataFeedTask extends QueueManipulationTask {
    
//--------  Create an instance of the QueueDataFeed task and store a reference to 
//          the QDF object to run its "Timed" function Add_Data  ---------
    
    public DataFeedTask(QueueDataFeed QDF)
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

