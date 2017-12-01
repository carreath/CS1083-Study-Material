
/**
 *
 * @author Eltaher
 */
public class Address {
    
    private String streetAddress, city, province, postalCode;
    
    public Address (String streetAddress, String city, String province, String postalCode)
    {
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
    
    public String toString()
    {
        return streetAddress + "\n\t\t" + city + ", " + province + " " + postalCode;
    }
}
