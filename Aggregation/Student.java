
/**
 *
 * @author Eltaher
 */
public class Student {
    
    private String firstName, lastName;
    
    private Address homeAddress, schoolAddress;
    
    public Student (String firstName, String lastName, Address homeAddress, Address schoolAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + "\n\n" + 
                "Home address: " + homeAddress.toString() +
                "\n\nSchool address: " + schoolAddress.toString();
    }
    
}
