
/**
 *
 * @author Eltaher
 */
public class Person implements Comparable {
    
    private String fname, lname;
    private int age;
    
    public Person(String fname, String lname, int age)
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    
    @Override
    public int compareTo(Object obj)
    {
        int result = (this.fname.compareToIgnoreCase(((Person)obj).fname));
        if (result != 0)
            return result;
        else {
                result = (this.lname.compareToIgnoreCase(((Person)obj).lname));
                if (result != 0)
                    return result;
                else {
                    if (this.age == (((Person)obj).age))
                        result = 0;
                    else if (this.age < (((Person)obj).age))
                        result = -1;
                    else
                        result = 1;
                    
                    return result;
                }
        }
    }
    
    
    public String getFirstName()
    {
        return fname;
    }
    
    public String getLastName()
    {
        return lname;
    }


    public int getAge()
    {
        return age;
    }
}
