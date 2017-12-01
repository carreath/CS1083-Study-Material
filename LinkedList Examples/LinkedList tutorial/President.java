
/**
 *
 * @author Eltaher
 */
public class President {
    
    private String name;
    private int startYr, endYr;
    
    public President(String name, int startYr, int endYr)
    {
        this.name = name;
        this.startYr = startYr;
        this.endYr = endYr;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    
    public String toString()
    {
        return name + "\t\t\t" + startYr + "-" + endYr;
    }
    
}
