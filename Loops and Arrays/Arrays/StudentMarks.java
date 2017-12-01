
import java.util.Scanner;

/**
 *
 * @author Eltaher
 */
public class StudentMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] stdNo, stdName;
        float[] assignment, finalexam;
        float midterm[];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Number of Students: ");
        
        int NOS = scan.nextInt();
        stdNo = new String[NOS];
        stdName = new String[NOS];
        assignment = new float[NOS];
        midterm = new float[NOS];
        finalexam = new float[NOS];
        
        for (int count = 0; count < stdNo.length; count++)
        {
            System.out.println();
            System.out.println("Now Entering Student " + (count +1) + " Information . . .");
            System.out.println();

            System.out.print("Enter Student Number: ");
            stdNo[count] = scan.next();
            System.out.print("Enter Student Name: ");
            stdName[count] = scan.next();     
            System.out.print("Enter Assignment Mark: ");
            assignment[count] = scan.nextFloat();            
            System.out.print("Enter Midterm Mark: ");
            midterm[count] = scan.nextFloat();            
            System.out.print("Enter Final Exam Mark: ");
            finalexam[count] = scan.nextFloat();
        }
        
        System.out.print("The following is a list of the students and their marks . . .");
        System.out.println();
        System.out.println();
        String format = "%-15s %-25s %-15s %-15s %-15s %-15s %n";
        System.out.format(format, "StdNo", "StdName", "Assignment", "Midterm", "Final Exam", "Final Mark");
        System.out.println("------------------------------------------------------------------------------" +
                            "-------------------------");

        for (int count = 0; count < stdNo.length; count++)
        {
            format = "%-15s %-25s %-15.2f %-15.2f %-15.2f %.2f %s %n";

            System.out.format(format, stdNo[count], stdName[count], assignment[count], midterm[count],
                        finalexam[count], (assignment[count] + midterm[count] + finalexam[count]), "%");
        }
    }
    
}
