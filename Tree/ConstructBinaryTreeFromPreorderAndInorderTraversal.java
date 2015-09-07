package Tree;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length-1 , inorder, 0, inorder.length-1);
    }
    public TreeNode helper(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd){
        if(pStart > pEnd || iStart > iEnd)
            return null;
        int val = preorder[pStart];
        TreeNode root = new TreeNode(val);
        int rootIndex = 0;
        for(int i = iStart; i <= iEnd; i++){
            if(inorder[i] == val){
                rootIndex = i;
                break;
            }
        }
        TreeNode left = helper(preorder, pStart+1, pEnd, inorder, iStart, rootIndex-1);
        TreeNode right = helper(preorder, pStart+rootIndex-iStart+1, pEnd, inorder, rootIndex+1, iEnd);
        root.left = left;
        root.right = right;
        return root;
    }
}
