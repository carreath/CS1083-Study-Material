
/**
 *
 * @author Eltaher
 */
public class IntegerKey_BST_Recursion_Management {
    
    IntegerKey_BST_Recursion bst = new IntegerKey_BST_Recursion ();
    
    public String insert(int value) {
        if (bst.insert(value))
            return "Insertion successful.";
        else
            return "Value cannot be inserted.";
    }
    
    
    public boolean search(int value) {
        return bst.search(value);
    }
    
    public int rootValue() {
        return bst.rootValue();
    }
    
    public int minValue() {
        return bst.minValue();
    }

    
    public int maxValue() {
        return bst.maxValue();
    }
    
    
    public String levelOrder() {
        return bst.levelOrder();
    }
    
    
    public String  preOrder() {
        return bst.preOrder(null, null);
    }
    

    public String inOrder() {
        return bst.inOrder(null, null);
    }
    
    public String postOrder() {
        return bst.postOrder(null, null);
    }
    
}
