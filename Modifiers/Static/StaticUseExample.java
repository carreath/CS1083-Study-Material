
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class StaticUseExample {

    /**
     * @param args the command line arguments
     */
    
    static boolean stopped;
    static Scanner scan = new Scanner(System.in);
    static Gas_Station gasStation = new Gas_Station();
        
    public static void main(String[] args) {

        Car.Instructions();
        
        System.out.println("The car is full of gas and ready to be driven...");

        Drive();
        
        System.out.println();
        
        if (stopped)
            System.out.println("You have decided to stop driving.");
        else
            System.out.println("Your car has run out of gas!");
    }
    
    
    private static void Drive()
    {
        float distance;
        char choice;
        Car car = new Car(100);
        
        while (!car.Empty_Tank() && !stopped)
        {
            System.out.println();
            System.out.print("Enter the distance you want to drive: ");
            distance = scan.nextFloat();
            distance = car.Drive(distance);
            System.out.println();
            System.out.printf("You have driven (%,.3f" + 
                                "). Remaining gas is (%,.2f).", distance, car.Check_GasInTank());
            System.out.println();
            
            if (car.Check_GasInTank() > 0.0)
            {
                choice = ' ';
                while (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n')
                {
                    System.out.println();
                    System.out.print("Fill car with gas (y/n)?");
                    choice = scan.next().charAt(0);
                    
                    if (choice == 'Y' || choice == 'y')
                    {
                        gasStation.Fill(car);
                        System.out.println();
                        System.out.println("The car is full of gas and ready to be driven...");
                    }
                    else if (choice != 'N' && choice != 'n')
                             System.out.println("Invalid choice!");
                }
            }
            
            if (car.Check_GasInTank() > 0.0)
            {
                choice = ' ';
                while (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n')
                {
                    System.out.println();
                    System.out.print("Do you want to continue driving (y/n)?");
                    choice = scan.next().charAt(0);
                    
                    if (choice == 'Y' || choice == 'y')
                        stopped = false;
                    else if (choice == 'N' || choice == 'n')
                        stopped = true;
                    else
                         System.out.println("Invalid choice!");
                }
            }
        }
    }
    
}
