package Backtracking;
import java.util.*;
public class PermutationII {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return res;
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums, res, new ArrayList<Integer>(), visited);
        return res;
    }
    private void helper(int[] nums, List<List<Integer>> res, ArrayList<Integer> list, boolean[] visited){
        if(list.size() == nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1])
                continue;
            if(!visited[i]){
                visited[i] = true;
                list.add(nums[i]);
                helper(nums, res, list, visited);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args){
    	PermutationII per = new PermutationII();
    	int[] array = {1,1,2};
    	List<List<Integer>> res = per.permuteUnique(array);
    }
}
