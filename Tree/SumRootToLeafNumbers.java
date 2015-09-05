package Tree;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    public int helper (TreeNode root, int sum){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.val + sum;
        sum = (root.val + sum) * 10;
        int left = helper(root.left, sum);
        int right = helper(root.right, sum);
        return left + right;
    }
}
