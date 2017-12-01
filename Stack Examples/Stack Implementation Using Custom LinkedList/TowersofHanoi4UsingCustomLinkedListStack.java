
import static towersofhanoi4customlinkedliststackexample.TowersofHanoi4CustomLinkedListStackExample.peg1;
import static towersofhanoi4customlinkedliststackexample.TowersofHanoi4CustomLinkedListStackExample.peg2;
import static towersofhanoi4customlinkedliststackexample.TowersofHanoi4CustomLinkedListStackExample.peg3;
/**
 *
 * @author Eltaher
 */
public class TowersofHanoi4UsingCustomLinkedListStack {
    
    public static void Solve_Towers_Problem(int lastTargetPeg) throws Exception
    {
        Print_Towers(0);

        if (lastTargetPeg != 0 && (!peg1.empty()) && ((Integer)peg1.peek()) > 0 && 
            (peg2.empty() || (Integer)peg2.peek() == 0 || (((Integer)peg1.peek()) < ((Integer)peg2.peek())) && (((Integer)peg2.peek())- ((Integer)peg1.peek()) != 2)))
        {
            peg2.push(peg1.pop());
            lastTargetPeg = 1;
        }
        else if (lastTargetPeg != 0 && (!peg1.empty()) && ((Integer)peg1.peek()) > 0 && 
            (peg3.empty() || (Integer)peg3.peek() == 0 || (((Integer)peg1.peek()) < ((Integer)peg3.peek())) && (((Integer)peg3.peek())- ((Integer)peg1.peek()) != 2)))        
        {
            peg3.push(peg1.pop());
            lastTargetPeg = 2;
        }
        else if (lastTargetPeg != 1 && (!peg2.empty()) && ((Integer)peg2.peek()) > 0 && 
            (peg3.empty() || (Integer)peg3.peek() == 0 || (((Integer)peg2.peek()) < ((Integer)peg3.peek())) && (((Integer)peg3.peek())- ((Integer)peg2.peek()) != 2)))        
        {
            peg3.push(peg2.pop());
            lastTargetPeg = 2;
        }        
        else if (lastTargetPeg != 1 && (!peg2.empty()) && ((Integer)peg2.peek()) > 0 && 
            (peg1.empty() || (Integer)peg1.peek() == 0 || (((Integer)peg2.peek()) < ((Integer)peg1.peek())) && (((Integer)peg1.peek())- ((Integer)peg2.peek()) != 2)))        
        {
            peg1.push(peg2.pop());
            lastTargetPeg = 0;
        }
        else if (lastTargetPeg != 2 && (!peg3.empty()) && ((Integer)peg3.peek()) > 0 && 
            (peg1.empty() || (Integer)peg1.peek() == 0 || (((Integer)peg3.peek()) < ((Integer)peg1.peek())) && (((Integer)peg1.peek())- ((Integer)peg3.peek()) != 2)))        
        {
            peg1.push(peg3.pop());
            lastTargetPeg = 0;
        }
        else if (lastTargetPeg != 2 && (!peg3.empty()) && ((Integer)peg3.peek()) > 0 && 
            (peg2.empty() || (Integer)peg2.peek() == 0 || (((Integer)peg3.peek()) < ((Integer)peg2.peek())) && (((Integer)peg2.peek())- ((Integer)peg3.peek()) != 2)))        
        {
            peg2.push(peg3.pop());
            lastTargetPeg = 2;
        }        

                
        if (((!peg1.empty()) && ((Integer)peg1.peek() > 0)) || ((!peg2.empty()) && ((Integer)peg2.peek() > 0)))
            Solve_Towers_Problem(lastTargetPeg);
        else
            Print_Towers(0);
    }        

    
    public static void Print_Towers(int counter) throws Exception
    {
        if (peg1.size() > counter)
            System.out.print(peg1.elementAt(counter));
        else
           System.out.print("|");

        System.out.print("        ");
        
        if (peg2.size() > counter) 
            System.out.print(peg2.elementAt(counter));
        else
            System.out.print("|");

        System.out.print("        ");        
        
        if (peg3.size() > counter)
            System.out.println(peg3.elementAt(counter));        
        else
            System.out.println("|");

        counter++;
        if (counter < 4)
            Print_Towers(counter);  
        else
            System.out.println("-------------------\n");
    }    
}