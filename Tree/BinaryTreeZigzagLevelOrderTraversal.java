package Tree;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
            return res;
        LinkedList<TreeNode> set = new LinkedList<TreeNode>();
        int flag = 0;
        set.add(root);
        while(!set.isEmpty()){
            int size = set.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode node;
                if(flag == 0){
                    node = set.poll();
                    list.add(node.val);
                    if(node.left != null)
                        set.add(node.left);
                    if(node.right != null)
                        set.add(node.right);
                }
                else{
                    node = set.pollLast();
                    list.add(node.val);
                    if(node.right != null)
                        set.addFirst(node.right);
                    if(node.left != null)
                        set.addFirst(node.left);
                }
            }
            res.add(list);
            if(flag == 0)
                flag = 1;
            else
                flag = 0;
        }
        return res;
    }
}
