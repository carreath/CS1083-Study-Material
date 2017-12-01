
/**
 *
 * @author Eltaher
 */
public class Fruit {
    
    private Object[] fruitAttribute = new Object[4];
    
    public Fruit(Object name, Object taste, Object season, Object price)
    {
        fruitAttribute[0] = name;
        fruitAttribute[1] = taste;
        fruitAttribute[2] = season;
        fruitAttribute[3] = price;
    }
    
    public Object getFruitAttribute(int index)
    {
        if (index < 0 || index >= fruitAttribute.length)
            return null;
        else
            return fruitAttribute[index];
    }
    
    public void setFruitAttribute(int index, Object value)
    {
        if (fruitAttribute.length > 0 && (index >= 0 && index < fruitAttribute.length))
            fruitAttribute[index] = value;
    }    
    
}
