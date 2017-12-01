
/**
 *
 * @author Eltaher
 */
public class DataConsumptionTask extends QueueManipulationTask {
    

    public DataConsumptionTask(QueueDataFeed QDF)
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

