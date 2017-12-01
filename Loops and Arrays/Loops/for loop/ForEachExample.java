
/**
 *
 * @author Eltaher
 */
public class ForEachExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] stdNames = {"John", "Mark", "Jim", "Kate", "Josh", 
                            "Emily", "Marg", "Isaac", "Patric", "Sara"};
        double[] stdMarks = {73.2, 56.2, 91.5, 88, 64.9, 47.75, 94.25, 66.75, 75, 81};
        
        int index = 0;
        System.out.println("Name\tMark");
        System.out.println("------------");

        for (String student: stdNames)
        {
            System.out.print(student);
            
            System.out.println("\t" + stdMarks[index]);
            
            index = index + 1;
        }
    }
    
}
