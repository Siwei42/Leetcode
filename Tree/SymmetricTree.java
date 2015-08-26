package Tree;
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
//	recursive method
	public boolean isSymmetric1(TreeNode root) {
        if(root == null)
            return true;
        return helper(root.left, root.right);
    }
    private boolean helper(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null)
            return true;
        else if(r1 == null || r2 == null)
            return false;
        if(r1.val == r2.val)
            return helper(r1.left, r2.right) && helper(r1.right, r2.left);
        else
            return false;
    }
//	iterative method
    public boolean isSymmetric2(TreeNode root) {
        if(root == null)
            return true;
        TreeNode r1 = root.left;
        TreeNode r2 = root.right;
        LinkedList<TreeNode> stack1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> stack2 = new LinkedList<TreeNode>();
        if((r1 == null && r2 != null) || (r2 == null && r1 != null))
            return false;
        while((r1 != null || !stack1.isEmpty()) || ( r2 !=null || !stack2.isEmpty())){
            if(r1 != null && r2 != null){
                if(r1.val != r2.val)
                    return false;
                else{
                    stack1.push(r1);
                    stack2.push(r2);
                    r1 = r1.left;
                    r2 = r2.right;
                }
            } 
            else if(r1 == null && r2 == null){
                r1 = stack1.pop();
                r2 = stack2.pop();
                r1 = r1.right;
                r2 = r2.left;
            }
            else
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
    TreeNode root = new TreeNode(2);
    TreeNode node1 = new TreeNode(3);
    TreeNode node2 = new TreeNode(3);
    TreeNode node3 = new TreeNode(4);
    TreeNode node4 = new TreeNode(5);
    TreeNode node5 = new TreeNode(4);
    node1.left = node3;
    node1.right = node4;
    node2.left = null;
    node2.right = node5;
    root.left = node1;
    root.right = node2;
    SymmetricTree st = new SymmetricTree();
    st.isSymmetric2(root);
    }
}
