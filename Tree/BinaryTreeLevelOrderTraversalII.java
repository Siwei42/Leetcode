package Tree;
import java.util.*;
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(size-- > 0){
                TreeNode curNode = queue.poll();
                list.add(curNode.val);
                if(curNode.left != null){
                    queue.add(curNode.left);
                }
                if(curNode.right != null){
                    queue.add(curNode.right);
                }
            }
            res.addFirst(list);
        }
        return res;
    }
}
