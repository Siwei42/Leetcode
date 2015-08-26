package Tree;
import java.util.*;

public class BinaryTreePostorderTraversal {
//	recursive method
	public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        helper(root, res);
        return res;
    }
    public void helper(TreeNode n, List<Integer> res){
        if(n == null)
            return;
        helper(n.left, res);
        helper(n.right, res);
        res.add(n.val);
    }
//	iterative method    
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        LinkedList<TreeNode> stack1 = new LinkedList<TreeNode>();
        LinkedList<Boolean> stack2 = new LinkedList<Boolean>();
        while(root != null || !stack1.isEmpty()){
            if(root != null){
                stack1.push(root);
                stack2.push(true);
                root = root.left;
            }
            else{
                boolean status = stack2.pop();
                root = stack1.peek();
                if(status){
                    stack2.push(false);
                    root = root.right;
                }
                else{
                    stack1.pop();
                    res.add(root.val);
                    root = null;
                }
            }
        }
    return res;
    }
}
