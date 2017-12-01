
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class AggregationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char choice;
        String fname, lname, street, city, prov, postalCd;
        Address homeAddress = null, schoolAddress = null;
        Student student;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Enter student's first name: ");
            fname = scan.nextLine();
            
            System.out.print("Enter student's last name: ");
            lname = scan.nextLine();            
            
            for (int i = 0; i < 2; i++)
            {
                System.out.println();
                if (i==0)
                    System.out.println("Enter student's home address... ");
                else
                    System.out.println("Enter student's school address... ");

                System.out.println();
                System.out.print("Enter street: ");
                street = scan.nextLine();      

                System.out.print("Enter city: ");
                city = scan.nextLine();            
            
                System.out.print("Enter province: ");
                prov = scan.nextLine();            
            
                System.out.print("Enter postal code: ");
                postalCd = scan.nextLine();            
            
                if (i==0)
                    homeAddress = new Address(street, city, prov, postalCd);
                else
                    schoolAddress = new Address(street, city, prov, postalCd);
            }
            
            student = new Student(fname, lname, homeAddress, schoolAddress);
            System.out.println();
            System.out.println("This is the student info...");
            System.out.println();
            System.out.println(student.toString());
            
            choice = ' ';
            while (choice != 'Y' && choice !='y' && choice != 'N' && choice != 'n') {
                System.out.println();
                System.out.print("Another student (y/n)?");
                choice = scan.next().charAt(0); 
                scan.nextLine();
                
                if (choice != 'Y' && choice !='y' && choice != 'N' && choice != 'n') {
                    System.out.println();
                    System.out.println("Invalid choice entered!");
                }
            }
            
        } while (choice != 'N' && choice != 'n');
            
    }
    
}
