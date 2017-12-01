
/**
 *
 * @author Eltaher
 */
public class Dictionary  extends Book {
    
    private int definitions;
    
    public Dictionary(int pages, int definitions)
    {
        super(pages);
        this.definitions = definitions;
    }
    
    public double computeRatio()
    {
        return definitions / (double) pages;
    }
    
    public void setDefinitions(int definitions)
    {
        this.definitions = definitions;
    }
    
    public int getDefinitions()
    {
        return definitions;
    }
    
}
