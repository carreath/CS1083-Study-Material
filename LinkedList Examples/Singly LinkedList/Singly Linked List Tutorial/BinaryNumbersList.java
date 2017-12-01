
/**
 *
 * @author Eltaher
 */
public class BinaryNumbersList {
    
    private BinaryNumbersNode head;
    private BinaryNumbersNode tail;
    
    private int nodeCount;
    
    public BinaryNumbersList()
    {
        head = null;
        tail = null;
        nodeCount = 0;
    }
    
    
    public int size()
    {
        return nodeCount;
    }
    
    
    public void add(int decimalNumber)
    {
        BinaryNumbersNode node = new BinaryNumbersNode(decimalNumber);

        if (head == null) {
            head = node;
            tail = node;
            node.binaryRep[node.binaryRep.length - 1] = '1';
        }
        else {
                node.binaryRep = Get_Binary_Value();
                tail.next = node;
                tail = node;
        }
        
        nodeCount++;
    }
        
        
    private char[] Get_Binary_Value() {
        
        char[] bRep = tail.binaryRep.clone();
        
        for (int i = bRep.length - 1; i > - 1; i--) {
            if (bRep[i] != '1' && bRep[i] != '?') {
                bRep[i] = '1';
                for (int j = bRep.length - 1; j > i; j--)
                     bRep[j] = '0';
                i = -1;
            }
            else if (i == 0) {
                for (int k = 0; k < bRep.length; k++)
                     bRep[k] = '?';
            }
        }
        
        return bRep;
    }
    
    
    public String get(int index)
    {
        if (index >= 0 && index < this.size())
        {
            BinaryNumbersNode current = head;
            if (index > 0) {
                for (int i = 1; i <= index && i < this.size(); i++)
                     current = current.next;
            }

            return current.toString();
        }
        else
            return "";
    }
    
    private class BinaryNumbersNode {
        
        private int decimalNumber;
        private char[] binaryRep;
        private BinaryNumbersNode next;
        
        public BinaryNumbersNode(int decimalNumber)
        {
            this.decimalNumber = decimalNumber;
            binaryRep = new char[10];
            next = null;
        }
        
        
        public String toString() {
            
            String result = decimalNumber + " \t\t--->\t ";
            for (int i = 0; i < binaryRep.length; i++)
                result += binaryRep[i];
            
            return result;
        }
                
       
    }
    
}
