
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class StudentMarksOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student[] student;
        String stdNo, stdName;
        float assignment, midterm, finalexam;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number of Students: ");
        
        int NOS = scan.nextInt();
        student = new Student[NOS];
        
        for (int count = 0; count < student.length; count++)
        {
            System.out.println();
            System.out.println("Now Entering Student " + (count +1) + " Information . . .");
            System.out.println();

            System.out.print("Enter Student Number: ");
            stdNo = scan.next();
            System.out.print("Enter Student Name: ");
            stdName = scan.next();     
            System.out.print("Enter Assignment Mark: ");
            assignment = scan.nextFloat();            
            System.out.print("Enter Midterm Mark: ");
            midterm = scan.nextFloat();            
            System.out.print("Enter Final Exam Mark: ");
            finalexam = scan.nextFloat();
            
            student[count] = new Student(stdNo, stdName, assignment, midterm,finalexam);
        }
        
        System.out.print("The following is a list of the students and their marks . . .");
        System.out.println();
        System.out.println();
        String format = "%-15s %-25s %-15s %-15s %-15s %-15s %n";
        System.out.format(format, "StdNo", "StdName", "Assignment", "Midterm", "Final Exam", "Final Mark");
        System.out.println("------------------------------------------------------------------------------" +
                            "-------------------------");

        for (int count = 0; count < student.length; count++)
        {
            format = "%-15s %-25s %-15.2f %-15.2f %-15.2f %.2f %s %n";

            System.out.format(format, student[count].getStdnumber(), student[count].getStdname(), 
                    student[count].getAssignment(), student[count].getMidterm(), student[count].getFinalexam(),
                    (student[count].getAssignment() + student[count].getMidterm() + student[count].getFinalexam()), "%");
        }
    }
    
}




class Student {
    
    private String stdNo, stdName;
    private float assignment, finalexam, midterm;
    
    public Student(String stdNo, String stdName, float assignment, float midterm, float finalexam)
    {
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.assignment = assignment;
        this.midterm = midterm;
        this.finalexam = finalexam;
    }
    
    public void setAssignment(float assignment)
    {
        this.assignment = assignment;
    }
    
    public void setMidterm(float midterm)
    {
        this.midterm = midterm;
    }
    
    public void setFinalexam(float finalexam)
    {
        this.finalexam = finalexam;
    }
    
    public String getStdnumber()
    {
        return stdNo;
    }
    
    public String getStdname()
    {
        return stdName;
    }
    
    public float getAssignment()
    {
        return assignment;
    }
    
    public float getMidterm()
    {
        return midterm;
    }
    
    public float getFinalexam()
    {
        return finalexam;
    }
}

