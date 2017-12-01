
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class Registration {
    
    public static Scanner scan = new Scanner(System.in);
    public static HashMap<Integer, Student_Subs> student = new HashMap();
    public static HashMap<String, Subject_Stds> subject = new HashMap();    
    
    public static void Menu()
    {
        Student_Subs std = null;
        Subject_Stds sub = null;
        int choice;
        boolean more = true;
        try {
            do {
                System.out.println();
            
                System.out.println("0.  Exit");
                System.out.println("1.  List Student Subjects");
                System.out.println("2.  List Subject Students");
                System.out.println("3.  Drop Student Subject");
                System.out.println("4.  Delete Student");
                System.out.println("5.  Delete Subject");
                System.out.println();
                System.out.print("Enter your choice: ");
            
                choice = scan.nextInt();
                scan.nextLine();
                
                 if (choice == 1) {
                     do {
                        std = Choose_Student();
                        if (std!= null)
                            Print_Student_Subjects(std);
                     } while (std != null);
                 }
                 else if (choice == 2) {
                     do {
                        sub = Choose_Subject();
                        if (sub != null)
                            Print_Subject_Students(sub);
                     } while (sub != null);
                 }
                 else if (choice == 3) {
                     do {
                         std = Choose_Student();
                         if (std !=null)
                             sub = Choose_Subject();
                             if (sub != null) {
                                std.dropStdSub(sub);
                                System.out.println();
                                System.out.println("Subject: " + sub.getId() + 
                                        " is dropped from Student: " + std.getName() + ".");
                            }
                     } while (std != null && sub != null);
                 }
                 else if (choice == 4) {
                     do {
                        std = Choose_Student();
                        if (std != null) {
                            std.dropAllStdSubs(std);
                            student.remove(std.getId());
                            System.out.println();
                            System.out.println("Student: " + std.getId() + " is deleted.");
                         }
                     } while (std != null);
                 }
                 else if (choice == 5) {
                     do {
                         sub = Choose_Subject();
                         if (sub != null) {
                             sub.dropAllSubStds(sub);
                             subject.remove(sub.getId());
                             System.out.println();
                             System.out.println("Subject: " + sub.getId() + " is deleted.");
                        }
                     } while (sub != null);
                 }                 
                 else if (choice == 0)
                     more = false;
                else
                    System.out.println("\t\t\t\t\tInvalid choice entered.");
            } while (more);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured when choosing a menu item.\n\n" + exp);
        }
    }
        

    
    public static Student_Subs Choose_Student()
    {
        Student_Subs std = null;
        int stdid = 0;
        boolean found = false;
        try {
            do {
                System.out.println();
            
                System.out.print("Enter student id or 0 to exit: ");
            
                stdid = scan.nextInt();
                scan.nextLine();
            
                if (stdid > 0) {
                    if(student.containsKey(stdid)) {
                        std = student.get(stdid);
                        found = true;
                    }
                    else
                        System.out.println("\t\t\t\t\tStudent id does not exist.");
                }
                else if (stdid == 0)
                    found = true;
                else
                    System.out.println("\t\t\t\t\tInvalid student id entered.");
            } while (!found);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured when choosing a student " +
                                "to list his/her subjects.\n\n" + exp);
        }  
        
        return std;
    }
    
    
    
    public static Subject_Stds Choose_Subject()
    {
        Subject_Stds sub = null;
        String subid;
        boolean found = false;
        try {
            do {
                System.out.println();
            
                System.out.print("Enter subject id or x to exit: ");
                subid = scan.nextLine();
            
                if (subid.compareToIgnoreCase("x") != 0) {
                    if (subject.containsKey(subid))
                    {
                        sub = subject.get(subid);
                        found = true;
                    }
                    else
                        System.out.println("\t\t\t\t\tSubject id does not exist.");
                }
               else if (subid.compareToIgnoreCase("x") == 0)
                    found = true;
                else
                    System.out.println("\t\t\t\t\tInvalid subject id entered.");
            } while (!found);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured when choosing subject to " +
                                "list its students.\n\n" + exp);
        }
        
        return sub;
    }
    
    
    public static void Enter_Subjets()
    {
        String subid;
        int credits;
        boolean more = true;
        try {
            do {
                System.out.println();
            
                System.out.print("Enter subject id or x to exit: ");
            
                subid = scan.nextLine();
            
                if (subid.compareToIgnoreCase("x") != 0) {
                    System.out.print("Enter subject credits or 0 to exit: ");
                    credits = scan.nextInt();
                    scan.nextLine();
                    if (credits > 0 && credits < 6) {
                        subject.put(subid, new Subject_Stds(subid, credits));
                        System.out.println("Subject added.");
                    }
                    else if (credits == 0)
                        more = false;
                    else
                        System.out.println("\t\t\t\t\tInvalid credits entered.");
                }
                else more = false;
            } while (more);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured entering subjects.\n\n" + exp);
        }
    }
            
            

    public static void Register_Students()
    {
        int stdid;
        String name;
        boolean more = true;
        try {
            do {
                System.out.println();
            
                System.out.print("Enter student id or 0 to exit: ");
            
                stdid = scan.nextInt();
                scan.nextLine();
            
                if (stdid > 0) {
                    System.out.print("Enter student name or x to exit: ");
                    name = scan.nextLine();
                    if (name.compareToIgnoreCase("x") != 0) {
                        student.put(stdid, new Student_Subs(stdid, name));
                        System.out.println("Student registered.");
                    }
                    else more = false;
                }
                else if (stdid == 0)
                    more = false;
                else
                    System.out.println("\t\t\t\t\tInvalid student id entered.");
            } while (more);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured registering students.\n\n" + exp);
        }
    }
            

    public static void Register_Subjects_For_Student()
    {
        Student_Subs std = null;
        boolean more = true;
        try {
            do {
                std = Choose_Student();
                if (std != null)
                    Add_Subs_To_Student(std);
                else
                    more = false;
            } while (more);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured choosing a student.\n\n" + exp);
        }        
    }
    
    
    
    public static void Add_Subs_To_Student(Student_Subs std)
    {
        Subject_Stds sub = null;
        boolean more = true;
        try {
            do {
                sub = Choose_Subject();
                if (sub != null)
                {
                    std.addStdSubs(sub);
                    System.out.println("Subject added to student's Set.");
                    sub.addSubStds(std);
                    System.out.println("Student added to subject's Set.");
                }                
                else
                    more = false;
            } while (more);
        }
        catch (Exception exp)
        {
            System.out.println("Exception occured when adding subjects to the student.\n\n" + exp);
        }
    }
            
    
    public static void Print_Subject_List()
    {
        System.out.println();
        System.out.println("Sub ID\t\tCredits");
        System.out.println("------------------------");        
        for (Map.Entry<String, Subject_Stds> entry: subject.entrySet())
            System.out.println(entry.getValue().getSubInfo());
    }
        
    
    public static void Print_Student_List()
    {
        System.out.println();
        System.out.println("Std ID\t\tStd Name");
        System.out.println("------------------------");
        for (Map.Entry<Integer, Student_Subs> entry: student.entrySet())
            System.out.println(entry.getValue().getStdInfo());
    }
    
    
    public static void Print_Subject_Students(Subject_Stds sub)
    {
        System.out.println();
        System.out.println("Sub ID: " + sub.getId() + "\t\tCredits: " + sub.getCredits());
        System.out.println();
        System.out.println("Std ID\t\tStd Name");
        System.out.println("------------------------");        
        System.out.println(sub.getSubStds());
    }
    
    
    public static void Print_Student_Subjects(Student_Subs std)
    {
        System.out.println();
        System.out.println("Std ID: " + std.getId() + "\t\tName: " + std.getName());
        System.out.println();
        System.out.println("Sub ID\t\tCredits");
        System.out.println("------------------------");        
        System.out.println(std.getStdSubs());
    }    

}
