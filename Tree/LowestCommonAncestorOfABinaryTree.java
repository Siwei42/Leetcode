package Tree;

public class LowestCommonAncestorOfABinaryTree {
	
//	Divide & Conquer
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        
        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        
        if(left != null && right != null)
            return root;
        if(left != null)
            return left; 
        if(right != null)
            return right;
        
        return null;
    }
}
