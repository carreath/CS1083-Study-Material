
/**
 *
 * @author Eltaher
 */
public class Car {
    
    private float gasInTank;
    
    public Car(float litres)
    {
        this.gasInTank = litres;
    }
    
    
    public static void Instructions()
    {
        System.out.println("Instructions on how to drive your autonomous car");
        System.out.println("------------------------------------------------");
        System.out.println("1. Car will be full of gas and ready to be driven.");
        System.out.println("2. Enter the distance you want to drive.");
        System.out.println("3. If the distance is more than the capacity of " +
                                "the car tank, you will run out of gas.");
        System.out.println("4. After you have driven the distance you had entered, " +
                                "you will be asked if you want to fill gas.");
        System.out.println();
    }
    
    
    public float Drive(float distance)
    {
        float drivenDistance = gasInTank / (float) 0.13;
        if (drivenDistance >= distance)
        {
            gasInTank = (gasInTank - (distance * (float) 0.13));
            drivenDistance = distance;
        }
        else
            gasInTank = 0;
            
        return drivenDistance;
    }
    
    
    public float Check_GasInTank()
    {
        return gasInTank;
    }
    
    public boolean Empty_Tank()
    {
        if (gasInTank <= 0.0)
            return true;
        else
            return false;
    }
    
    public void Fill_Tank(float litres)
    {
        gasInTank = litres;
    }
    
}
