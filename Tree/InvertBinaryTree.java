package Tree;
import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 }
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}
