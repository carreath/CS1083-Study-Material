
/**
 *
 * @author Eltaher
 */
public class Account {
    
    private float expenses;
    
    public Account(float value)
    {
        expenses = value;
    }
    
    public float getTotalExpenses()
    {
        return expenses;
    }
    
    public float average(String timePeriod)
    {
        float result = 0;
        try
        {
            result = expenses/Float.parseFloat(timePeriod);
        }
        catch (Exception ex) 
        {
            System.out.println("Time period must be a floating point number!");
            result = -1;
        }
        finally
        {
            return result;
        }
    }
}
