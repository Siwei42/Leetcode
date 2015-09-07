package Tree;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length-1, postorder, postorder.length-1, 0);
    }
    public TreeNode helper(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd){
        if(iStart > iEnd || pStart < pEnd)
            return null;
        int val = postorder[pStart];
        TreeNode root = new TreeNode(val);
        int rootIndex = -1;
        for(int i = iStart; i <= iEnd; i++){
            if(inorder[i] == val){
                rootIndex = i;
                break;
            }
        }
        TreeNode right = helper(inorder, rootIndex+1, iEnd, postorder, pStart-1, pStart-iEnd+rootIndex);
        TreeNode left = helper(inorder, iStart, rootIndex-1, postorder, pStart-iEnd+rootIndex-1, pEnd);
        root.right = right;
        root.left = left;
        return root;
    }
}
