public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        backtrack(candidates, target, res, new ArrayList<Integer>(), 0);
        return res;
    }
    private void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int index){
        if(target < 0)
            return;
        else if(target == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = index; i < candidates.length; i++){
                list.add(candidates[i]);
                backtrack(candidates, target - candidates[i], res, list, i+1);
                list.remove(list.size()-1);
                while(i < candidates.length-1 && candidates[i] == candidates[i+1]) 
                    i++;  
        }
    }
}