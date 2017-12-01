
/**
 *
 * @author Eltaher
 */
public class Light implements PowerInterface {
    boolean on = false;

    public Light(boolean state) {
        on = state;
    }
    
    public String TurnOn()
    {
        if (on)
            return "Light is already on!";
        else
        {
            on = true;            
            return "Light is turned on.";
        }
    }
    
    public String TurnOff()
    {
        if (!on)
            return "Light is already off!";
        else
        {
            on = false;            
            return "Light is turned off.";
        }
    }
        
    
}
