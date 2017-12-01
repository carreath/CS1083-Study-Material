
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class CustomersArrayListExample {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Customer> customer = new ArrayList();
    static Scanner scan = new Scanner(System.in);
        
    public static void main(String[] args) {

        int choice = 0;
        CustomersArrayListExample obj = new CustomersArrayListExample();
        
        do {
            System.out.println();
            System.out.println("\tCustomer Menu");
            System.out.println();
            System.out.println("\t1. Add customer.");
            System.out.println("\t2. Delete customer.");
            System.out.println("\t3. Print customer info.");            
            System.out.println("\t9. Exit.");
            System.out.println();
            System.out.print("\tEnter your choice: ");
            choice = scan.nextInt();

            System.out.println();
            
            switch (choice)
            {
                case 1:
                    obj.addCustomer();
                    break;
                case 2:
                    if (customer.size() < 1) 
                        System.out.println("Customer ArrayList is empty.");                    
                    else
                        obj.deleteCustomer();
                    break;
                case 3:
                    if (customer.size() < 1)
                        System.out.println("Customer ArrayList is empty.");                    
                    else                    
                        obj.printCustomerInfo();
                    break; 
                case 9:
                    System.out.println("You chose to exit.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 9);
        
    }
    
    
    private void addCustomer()
    {
        Customer cust = new Customer();
        System.out.print("Enter customer id: ");
        cust.setId(scan.next());
        
        System.out.print("Enter customer name: ");
        cust.setName(scan.next());
        
        System.out.print("Enter customer email: ");
        cust.setEmail(scan.next());
        
        customer.add(cust);
        System.out.println("Customer is added.");
        System.out.println();
    }
    
    
    private void deleteCustomer()
    {
        System.out.print("Enter the id of the customer to be delete:");
        String id = scan.next();
        
        for (int i = 0; i < customer.size(); i++)
        {
            if (customer.get(i).getId().compareToIgnoreCase(id) == 0)
            {
                customer.remove(i);
                System.out.println("Customer is deleted.");
                i = customer.size();
            }
            else if (i == (customer.size() - 1))
                System.out.println("Invalid customer id!");
        }
        
        System.out.println();
    }
    
    
    private void printCustomerInfo()
    {
        for (Customer cust: customer)
        {
            System.out.println("customer id:  " + cust.getId());
            System.out.println("customer name:  " + cust.getName());
            System.out.println("customer email: " + cust.getEmail());
            System.out.println();
        }
    }
    
    
    class Customer {
        
        private String id, name, email;
        
        public void setId(String id)
        {
            this.id = id;
        }
        
        public void setName(String name)
        {
            this.name = name;
        }
        
        public void setEmail(String email)
        {
            this.email = email;
        }        
        
        public String getId()
        {
            return id;
        }
        
        public String getName()
        {
            return name;
        }
        
        public String getEmail()
        {
            return email;
        }        
    }
    
}
