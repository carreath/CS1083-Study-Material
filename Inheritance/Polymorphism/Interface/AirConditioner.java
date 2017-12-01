
/**
 *
 * @author Eltaher
 */
public class AirConditioner implements PowerInterface {
    
    boolean on = false;

    public AirConditioner(boolean state) {
        on = state;
    }
    
    public String TurnOn()
    {
        if (on)
            return "Air Conditioner is already on!";
        else
        {
            on = true;
            return "Air Conditioner is turned on.";
        }
    }
    
    public String TurnOff()
    {
        if (!on)
            return "Air Conditioner is already off!";
        else
        {
            on = false;
            return "Air Conditioner is turned off.";
        }
    }
    
    
}
