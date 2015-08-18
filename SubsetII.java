public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null)
            return res;
        List<Integer> list = new ArrayList<Integer>();
        res.add(list);
        Arrays.sort(nums);
        helper(nums, res, new ArrayList<Integer>(), 0);
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list, int index){
        if(index < nums.length){
            for(int i = index; i < nums.length; i++){
                list.add(nums[i]);
                res.add(new ArrayList<Integer>(list));
                helper(nums, res, list, i+1);
                if(nums.length > 1){
                    while(nums.length-1 > i && nums[i] == nums[i+1])
                        i++;
                }
                list.remove(list.size()-1);
            }
        }
    }
}