package Tree;

class ResultType{
    boolean isBST;
    int min, max;
    ResultType(boolean isBST, int min, int max){
        this.isBST = isBST;
        this.min = min;
        this.max = max;
    }
}
public class ValidateBinarySearchTree {
//	Method 1
	private int lastVal = Integer.MIN_VALUE;
    private boolean firstNode = true;
    public boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST1(root.left)) {
            return false;
        }
        if (!firstNode && lastVal >= root.val) {
            return false;
        }
        firstNode = false;
        lastVal = root.val;
        if (!isValidBST1(root.right)) {
            return false;
        }
        return true;
    }
    
    
//    Method 2
    public boolean isValidBST2(TreeNode root) {
        ResultType res = helper(root);
        return res.isBST;
    }
    public ResultType helper(TreeNode root){
        if(root == null)
            return new ResultType(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        if(!left.isBST || !right.isBST)
            return new ResultType(false, 0, 0);
        if(root.left != null && root.val <= left.max || root.right != null && root.val >= right.min)
            return new ResultType(false, 0, 0);
        return new ResultType(true, Math.min(root.val, left.min), Math.max(root.val, right.max));
    }
}
