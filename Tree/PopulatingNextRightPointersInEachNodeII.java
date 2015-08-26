package Tree;

public class PopulatingNextRightPointersInEachNodeII {
	public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        TreeLinkNode node = root.next;
        while(node != null){
            if(node.left != null){
                node = node.left;
                break;
            }
            if(node.right != null){
                node = node.right;
                break;
            }
            node = node.next;
        }
        if(root.right != null)
            root.right.next = node;
        if(root.left != null){
            if(root.right != null)
                root.left.next = root.right;
            else 
                root.left.next = node;
        }
        connect(root.right);
        connect(root.left);
    }
	public static void main(String[] args){
		TreeLinkNode root = new TreeLinkNode(0);
	    TreeLinkNode node1 = new TreeLinkNode(2);
	    TreeLinkNode node2 = new TreeLinkNode(4);
	    TreeLinkNode node3 = new TreeLinkNode(1);
	    TreeLinkNode node4 = new TreeLinkNode(3);
	    TreeLinkNode node5 = new TreeLinkNode(-1);
	    TreeLinkNode node6 = new TreeLinkNode(5);
	    TreeLinkNode node7 = new TreeLinkNode(1);
	    TreeLinkNode node8 = new TreeLinkNode(6);
	    TreeLinkNode node9 = new TreeLinkNode(8);
	    root.left = node1;
	    root.right = node2;
	    node1.left = node3; 
	    node1.right = null;
	    node2.left = node4; 
	    node2.right = node5;
	    node3.left = node6; 
	    node3.right = node7;
	    node4.left = null; 
	    node4.right = node8;
	    node5.left = node9; 
	    node5.right = null;
	    PopulatingNextRightPointersInEachNodeII p = new PopulatingNextRightPointersInEachNodeII();
	    p.connect(root);
	    
	}
}
