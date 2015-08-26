package Backtracking;
import java.util.*;
public class Permutation {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return res;
        boolean[] visited = new boolean[nums.length];
        helper(nums, res, new ArrayList<Integer>(), visited);
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] visited){
        if(list.size() == nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
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
    	Permutation per = new Permutation();
    	int[] array = {1,2,3};
    	List<List<Integer>> res = per.permute(array);
    }
}
