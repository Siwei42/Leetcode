package Tree;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    public TreeNode helper(int[] num, int low, int high){
        if(low>high)
            return null;
        int mid = (low+high)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num,low,mid-1);
        node.right = helper(num,mid+1,high);
        return node;
    }
}
