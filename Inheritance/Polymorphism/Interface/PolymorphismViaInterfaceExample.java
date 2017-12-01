
import java.util.ArrayList;

/**
 *
 * @author Eltaher
 */
public class PolymorphismViaInterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<PowerInterface> powerControl = new ArrayList();

        PowerInterface computer = new Computer(false);
        powerControl.add(computer);

        PowerInterface airConditioner = new AirConditioner(false);
        powerControl.add(airConditioner);

        PowerInterface light = new Light(false);
        powerControl.add(light);

        for (int i = 0; i < powerControl.size(); i++)
        {
            System.out.println();
            System.out.println("Turning object (" + i + ") on...");
            System.out.println(powerControl.get(i).TurnOn());
        }
        
        for (int i = 0; i < powerControl.size(); i++)
        {
            System.out.println();
            System.out.println("Turning object (" + i + ") off...");
            System.out.println(powerControl.get(i).TurnOff());
        }        
        
        for (int i = 0; i < powerControl.size(); i++)
        {
            System.out.println();
            System.out.println("Turning object (" + i + ") off...");
            System.out.println(powerControl.get(i).TurnOff());
        }        
    }
    
}
