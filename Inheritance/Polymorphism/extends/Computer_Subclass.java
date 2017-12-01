
/**
 *
 * @author Eltaher
 */
public class Computer_Subclass extends Electrical_Appliance {
    

    public Computer_Subclass(boolean state) {
        super(state);
    }
    
    @Override
    public String TurnOn()
    {
        if (on)
            return "Computer is already on!";
        else
        {
            on = true;            
            return "Computer is turned on.";
        }
    }
    
    @Override
    public String TurnOff()
    {
        if (!on)
            return "Computer is already off!";
        else
        {
            on = false;            
            return "Computer is turned off.";
        }
    }
        
    
}
