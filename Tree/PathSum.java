package Tree;
import java.util.*;
public class PathSum {
//	Method One
	public boolean hasPathSum1(TreeNode root, int sum) {
        if(root == null) 
            return false;
        sum -= root.val;
        if(root.left == null && root.right==null)  
            return sum == 0;
        else 
            return hasPathSum1(root.left,sum) || hasPathSum1(root.right,sum);
    }
//	Method Two
	public boolean hasPathSum2(TreeNode root, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        if(root == null)
            return false;
        helper(root, 0, set);
        return set.contains(sum);
    }
    public void helper(TreeNode root,int curSum, HashSet<Integer> set){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            set.add(curSum + root.val);
            return;
        }
        if(root.left != null)
            helper(root.left, root.val + curSum, set);
        if(root.right != null)
            helper(root.right, root.val + curSum, set);
    }
}
