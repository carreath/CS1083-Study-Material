
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Eltaher
 */
public class Student_Subs implements Comparable {
    
    private int id;
    private String name;
    
    private SortedSet<Subject_Stds> stdTSet = new TreeSet();
    
    public Student_Subs(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getStdInfo()
    {
        return id + "\t\t" + name + "\n";
    }
    
    public String getStdSubs()
    {
        String subjects = "";
        for (Subject_Stds subs: stdTSet)
        {
            subjects = subjects + subs.getId() + "\t\t";
            subjects = subjects + subs.getCredits() + "\n";
        }
        
        return subjects;
    }
    
    public void addStdSubs(Subject_Stds sub)
    {
        stdTSet.add(sub);
    }
    

    public void dropStdSub(Subject_Stds sub)
    {
        stdTSet.remove(sub);
    }
    
    
    public void dropAllStdSubs(Student_Subs std)
    {
        for (Subject_Stds sub: stdTSet)
        {
            sub.dropSubStd(std);
        }
    }
    
    
    
    @Override
    public int compareTo(Object t) {
        Student_Subs otherStudent = (Student_Subs) t;
       //compare name
        int nameDiff = name.compareToIgnoreCase(otherStudent.name);
        if(nameDiff != 0){
            return nameDiff;
        }
        //names are equals compare id
        return id - otherStudent.id;
    }
    
}
