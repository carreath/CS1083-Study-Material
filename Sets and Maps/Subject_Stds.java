
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Eltaher
 */
public class Subject_Stds implements Comparable {
    
    private String id;
    private int credits;
    
    private SortedSet<Student_Subs> subTSet = new TreeSet();
    
    public Subject_Stds(String id, int credits)
    {
        this.id = id;
        this.credits = credits;
    }

    
    public String getId()
    {
        return id;
    }
    
    public int getCredits()
    {
        return credits;
    }
    
    public String getSubInfo()
    {
        return id + "\t\t" + credits + "\n";
    }
    
    public String getSubStds()
    {
        String students = "";
        for (Student_Subs stds: subTSet)
        {
            students = students + stds.getId() + "\t\t";
            students = students + stds.getName() + "\n";
        }
        
        return students;
    }
    
    public void addSubStds(Student_Subs std)
    {
        subTSet.add(std);
    }

    
    public void dropSubStd(Student_Subs std)
    {
        subTSet.remove(std);
    }

    
    public void dropAllSubStds(Subject_Stds sub)
    {
        for (Student_Subs std: subTSet)
        {
            std.dropStdSub(sub);
        }
    }
    

    @Override
    public int compareTo(Object t) {
       
        Subject_Stds otherSubject = (Subject_Stds) t;
        //compare name
        int idDiff = id.compareToIgnoreCase(otherSubject.id);
        if(idDiff != 0){
            return idDiff;
        }
        //names are equals compare id
        return credits - otherSubject.credits;
    }
}
