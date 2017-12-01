
import java.util.ArrayList;

/**
 *
 * @author Eltaher
 */
public class PolymorphismViaInheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrical_Appliance> powerControl = new ArrayList();

        Electrical_Appliance computer = new Computer_Subclass(false);
        powerControl.add(computer);

        Electrical_Appliance airConditioner = new AirConditioner_Subclass(false);
        powerControl.add(airConditioner);

        Electrical_Appliance light = new Light_Subclass(false);
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
