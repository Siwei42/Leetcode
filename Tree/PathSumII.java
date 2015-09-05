package Tree;
import java.util.*;
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        helper(root, sum, 0, res, new ArrayList<Integer>());
        return res;
    }
    public void helper(TreeNode root, int sum, int curSum, List<List<Integer>> res, List<Integer> item){
        if(root == null)
            return;
        int temp = curSum + root.val;
        item.add(root.val);
        if(root.left == null && root.right == null){
            if(temp == sum)
                res.add(new ArrayList<Integer>(item));
        }
        if(root.left != null){
            helper(root.left, sum, temp, res, item);
        }
        if(root.right != null){
            helper(root.right, sum, temp, res, item);
        }
        item.remove(item.size()-1);
    }
}
