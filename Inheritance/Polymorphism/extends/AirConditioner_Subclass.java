
/**
 *
 * @author Eltaher
 */
public class AirConditioner_Subclass extends Electrical_Appliance {
    
    public AirConditioner_Subclass(boolean state) {
        super(state);
    }
    
    @Override
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
    
    @Override
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
