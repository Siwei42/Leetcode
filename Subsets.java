public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null)
            return null;
        List<List<Integer>> res = new ArrayList<List<Integer>>();  
        List<Integer> list = new ArrayList<Integer>();
        res.add(list);
        Arrays.sort(nums);
        helper(nums, res, list, 0);
        return res;
    }
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> list, int index){  
        if(index != nums.length){
            for(int i = index; i < nums.length; i++){
                list.add(nums[i]);
                res.add(new ArrayList<Integer>(list));
                helper(nums, res, list, i+1);
                list.remove(list.size()-1);
            }
        }
    }  
}