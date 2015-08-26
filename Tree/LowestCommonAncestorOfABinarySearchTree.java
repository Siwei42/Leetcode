package Tree;

public class LowestCommonAncestorOfABinarySearchTree {
//	recursive method
	public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor1(root.right, p, q);
        else if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor1(root.left, p, q);
        return root;
	}
//	iterative method    
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val > q.val){
                if (root.val < q.val)
                    root = root.right;
                else if(root. val > p.val)
                    root = root.left;
                else
                    return root;
            }
            else if(p.val < q.val){
                if (root.val > q.val)
                    root = root.left;
                else if(root. val < p.val)
                    root = root.right;
                else
                    return root;
            }
            else 
                return p;
        }
        return null;
    }
}
