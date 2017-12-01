
/**
 *
 * @author Eltaher
 */
public class Computer implements PowerInterface {
    
    boolean on = false;

    public Computer(boolean state) {
        on = state;
    }
    
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
