
/**
 *
 * @author Eltaher
 */
abstract public class Electrical_Appliance {
    
    boolean on;
    
    public Electrical_Appliance(boolean state) {
        on = state;
    }
    
    public abstract String TurnOn();
    
    public abstract String TurnOff();
    
}
