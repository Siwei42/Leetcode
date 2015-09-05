package Tree;
import java.util.*;
public class FlattenBinaryTreetoLinkedList {
//Recursive Method
	TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode tmp = root.right;
        if(pre != null){
            pre.left = null;
            pre.right = root;
        }
        pre = root;
        flatten(root.left);
        flatten(tmp);
    }
    
    public void flatten2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
 
        while(node != null || !stack.empty()){
 
            if(node.right != null){
                stack.push(node.right);
            }
    
            if(node.left != null){
                node.right = node.left;
                node.left = null;
            }else if(!stack.empty()){
                TreeNode tmp = stack.pop();
                node.right=tmp;
            }
    
            node = node.right;
        }
    }
}
