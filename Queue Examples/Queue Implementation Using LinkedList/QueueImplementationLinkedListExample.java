
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Eltaher
 */
public class QueueImplementationLinkedListExample {

    /**
     * @param args the command line arguments
     */
    static Timer DFTimer;
    static Timer DCTimer;
    static DataFeedLinkedListTask DFTask;
    static DataConsumptionLinkedListTask DCTask;
    static int counter = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QueueDataFeedLinkedList QDF = new QueueDataFeedLinkedList();
        StartDataFeedTimer(QDF, 1000);
        StartDataFeedTimer(QDF, 5000);
        String choice = "";
        do {
            System.out.println("Enter x and press ENTER to exit: ");
            choice = scan.nextLine();
        }   while (choice.compareToIgnoreCase("x") != 0);
            
        StopTimedTasks();
    }
    
    
    public static void StartDataFeedTimer(QueueDataFeedLinkedList QDF, int delayInMilliseconds)
    {
        try {
            
            if (delayInMilliseconds < 5000)
            {
                DFTimer = new Timer();
                DFTask = new DataFeedLinkedListTask(QDF);
                DFTimer.schedule(DFTask, 0, delayInMilliseconds);
            }
            else 
            {
                DCTimer = new Timer();
                DCTask = new DataConsumptionLinkedListTask(QDF);
                DCTimer.schedule(DCTask, 0, delayInMilliseconds);
            }
        } catch (Exception ex) {
            System.out.println("Error starting timer.\n\n" + ex);
        } 
    }
    

    public static void StopTimedTasks()
    {
        DFTask.cancel();
        DCTask.cancel();
        DFTimer.cancel();
        DFTimer.purge();
        DCTimer.cancel();
        DCTimer.purge();        
    }
}
