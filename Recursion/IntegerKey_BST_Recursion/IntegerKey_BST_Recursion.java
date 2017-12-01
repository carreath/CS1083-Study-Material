
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Eltaher
 */
public class IntegerKey_BST_Recursion {
    
    private Node root;
    
    public IntegerKey_BST_Recursion()
    {
        root = null;
    }
    
        
    public boolean insert(int value){
        
        Node current;
        boolean result = true, nullLink = false;
        
        if (root == null)
            root = new Node(value);
        else {       
            current = root;
            
            while (!nullLink) {
                if (value < current.value) {
                    if (current.left == null) {
                        current.left= new Node(value);
                        nullLink = true;
                    }
                    else
                        current = current.left;
                }
                else if (value > current.value) {
                    if (current.right == null) {
                        current.right= new Node(value);
                        nullLink = true;
                    }
                    else
                        current = current.right;                        
                }
                else {
                    result = false;
                    nullLink = true;
                }
            }
        }
        
        return result;
    }
       
    
    public boolean search(int value){

        Node current = root;
        boolean result = false;
        while (current != null && current.value != value) {
            if(value < current.value)
                current = current.left;
            else
                current = current.right;
        }

        if (current != null && current.value == value)
            result = true;                
        
        return result;
    }
    

    
    public String preOrder(String result, Node current) {
        if (result == null) {
            current = root;
            result = "| ";
        }
        
        if (current != null) {
            result += current.value + " | ";
            result = preOrder(result, current.left);
            result = preOrder(result, current.right);
        }

        return result;
    }
    
    

    public String inOrder(String result, Node current) {
        if (result == null) {
            current = root;
            result = "| ";
        }
        
        if (current != null) {
            result = inOrder(result, current.left);
            result += current.value + " | ";            
            result = inOrder(result, current.right);
        }

        return result;
    }
    
     
    
    public String postOrder(String result, Node current) {
        if (result == null) {
            current = root;
            result = "| ";
        }
        
        if (current != null) {
            result = postOrder(result, current.left);
            result = postOrder(result, current.right);
            result += current.value + " | ";                        
        }

        return result;
    }
    
    
    
    public String levelOrder()
    {
        Queue<Node> nodequeue = new LinkedList<Node>();
        Node current = root;
        String result = "";
        if (current != null)
            nodequeue.add(current);
        result = "| ";
        result = recursiveLevelOrder(current, nodequeue, result);
        
        return result;
    }
    
    
    public String recursiveLevelOrder(Node current, Queue<Node> nodequeue, String result)
    {
        if (!nodequeue.isEmpty()) {
            Node next = nodequeue.remove();
            result += next.value + " | ";
            if (next.left != null)
                nodequeue.add(next.left);

            if (next.right != null)
                nodequeue.add(next.right);
            
            result = recursiveLevelOrder(current, nodequeue, result);
        }
        
        return result;
    }
    
    
    public int rootValue() {
        if (root != null)
            return root.value;
        else
            return -1;
    }
    
    
    public int minValue(){
        Node current = root;
        if (current == null)
            return -1;
        else {
            while(current.left != null)
                current = current.left;
        }
            
        return current.value;
    }
    
    
    public int maxValue(){
        Node current = root;
        if (current == null)
            return -1;
        else {
            while(current.right != null)
                current = current.right;
        }
            
        return current.value;
    }
    
    
    private class Node {

        private int value;
        private Node left;
        private Node right;
    
        public Node(int value){
            this.value=value;
            left = null;
            right = null;
        }
    }
}
