package Tree;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Integer> list = new ArrayList<Integer>();
        int curLevel = 1;
        int tmpLevel = 0;
        while(!queue.isEmpty()){
            TreeNode curNode = queue.poll();
            curLevel--;
            list.add(curNode.val);
            if(curNode.left != null){
                queue.add(curNode.left);
                tmpLevel++;
            }
            if(curNode.right != null){
                queue.add(curNode.right);
                tmpLevel++;
            }
            if(curLevel == 0){
                res.add(list);
                curLevel = tmpLevel;
                tmpLevel = 0;
                list = new ArrayList<Integer>();
            }
        }
        return res;
    }
//	Method Two
	public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
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
            res.add(list);
        }
        return res;
    }
}
