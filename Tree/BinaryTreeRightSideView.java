package Tree;
import java.util.*;
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res, int level){
        if(res.size() <= level)
            res.add(root.val);
        if(root.right != null)
            helper(root.right, res, level + 1);
        if(root.left != null)
            helper(root.left, res, level + 1);
        return;
    }
}
