
import java.io.Serializable;

/**
 *
 * @author Eltaher
 */
public class Customer implements Serializable {
    
    private String name;
    private int accountNo;
    private float balance;
    
    public Customer(String name, int accountNo, float balance)
    {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    public String toString()
    {
        return "Name : " + name + "\n" +
                "Account No.: " + accountNo + "\n" +
                "Balance: " + balance + "\n";
        
    }
}
