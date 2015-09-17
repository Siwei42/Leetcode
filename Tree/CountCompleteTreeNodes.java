package Tree;

public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
        if(leftHeight(root) == rightHeight(root))
            return (1 << leftHeight(root)) - 1; 
        
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        
        return left + right + 1;
    }
    public int leftHeight(TreeNode root){
        int heightLeft = 0;
        while(root != null){
            root = root.left;
            heightLeft++;
        }
        return heightLeft;
    }
    public int rightHeight(TreeNode root){
        int heightRight = 0;
        while(root != null){
            root = root.right;
            heightRight++;
        }
        return heightRight;
    }
}
