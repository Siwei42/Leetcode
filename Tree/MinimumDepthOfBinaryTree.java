package Tree;
import java.util.*;
public class MinimumDepthOfBinaryTree {
//	Recursive Method
	public int minDepth1(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth1(root.left);
        int right = minDepth1(root.right);
        if(left == 0 || right == 0)
            return left > right ? left+1 : right+1;
        return left < right ? left+1 : right+1;
    }
	
//	Iterative Method
	public int minDepth2(TreeNode root) {
        if(root == null)
            return 0;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int res = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode curNode = queue.poll();
                if(curNode.left == null && curNode.right == null)
                    return res;
                if(curNode.left != null)
                    queue.add(curNode.left);
                if(curNode.right != null)
                    queue.add(curNode.right);
            }
            res++;
        }
        return res;
    }
}
