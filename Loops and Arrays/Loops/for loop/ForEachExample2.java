
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class ForEachExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int num = scan.nextInt();
        
        String stdName;
        float stdMark;
        for (int i = 0; i < num; i++)
        {
            System.out.println();
            System.out.println("Enter data for student (" + (i+1) + ")");
            System.out.println();
            System.out.println();
            stdName = scan.nextLine();
            System.out.print("Enter student name: ");
            stdName = scan.nextLine();
            
            System.out.print("Enter student mark: ");
            stdMark = scan.nextFloat();
            
            student.add(new Student(stdName, stdMark));
            System.out.println();
        }
        
        System.out.println();
        String format = "%-25s %-10s";
        System.out.format(format, "Name", "Mark");
        System.out.println();
        System.out.println("-------------------------------");
        
        format = "%-25s %-5.2f";
//        for (Iterator iterator1 = student.iterator(); iterator1.hasNext();)
//        {
//            Student std = (Student) iterator1.next();
//            System.out.format(format, std.getName(), std.getMark());
//            System.out.println();
//       }
        for (Student std: student)
        {
            System.out.format(format, std.getName(), std.getMark());
            System.out.println();
        }
    }
    
}


class Student {
    
    private String name;
    private double mark;
    
    public Student(String name, double mark)
    {
        this.name = name;
        this.mark = mark;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getMark()
    {
        return mark;
    }
}
