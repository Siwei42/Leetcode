package Tree;
import java.util.*;
public class BinarySearchTreeIterator {
	private TreeNode node;
    private Stack<TreeNode> stack;
    public BinarySearchTreeIterator(TreeNode root) {
        node = root;
        stack = new Stack<TreeNode>();
        while(root != null && !stack.isEmpty()){
            stack.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (node != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while(node != null && node.left != null) {
            stack.push(node);
            node = node.left;
        }
        TreeNode cur = null;
        if(node == null) {
            cur = stack.pop();
        } 
        else {
            cur = node;
        }
        node = cur.right;
        return cur.val;
    }
}
