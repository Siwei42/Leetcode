public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0)
            return res;
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<Integer>(), res, 0);
        return res;
    }
    private void backtrack(int[] candidates, int target, List<Integer> list, List<List<Integer>> res, int index){
        if(target < 0)
            return;
        else if(target == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(i > 0 && candidates[i] == candidates[i-1])
                continue;
            list.add(candidates[i]);
            backtrack(candidates, target-candidates[i], list, res, i);
            list.remove(list.size()-1);
        }
    }
}