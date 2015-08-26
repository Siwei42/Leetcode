package Backtracking;
import java.util.*;
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(k, n, res, new ArrayList<Integer>(), 1);
        return res;
    }
    private void backtrack(int k, int n, List<List<Integer>> res, List<Integer> list, int index){
        if(k == 0){
            if(n == 0){
                res.add(new ArrayList<Integer>(list));
                return;
            }
            else
                return;
        }
        if(k > 0){
            if(n <= 0)
                return;
            else if(n > 0){
                for(int i = index; i < 10; i++){
                    list.add(i);
                    backtrack(k-1, n-i, res, list, i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }
}