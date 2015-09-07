package Tree;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePreorderTraversal {
//	Recursive Method 1
	public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if(root == null)
            return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
//	Divide & Conquer
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> pre = new LinkedList<Integer>();
        if(root==null) 
        	return pre;
        pre.add(root.val);
        pre.addAll(preorderTraversal2(root.left));
        pre.addAll(preorderTraversal2(root.right));
        return pre;
    }
//  Using iteration (stack)
    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(); 
        while(root != null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                res.add(root.val);
                root = root.left;
            }    
            else{
                root = stack.pop();
                root = root.right;
            }
        }
    return res;
    }
}
