package Backtracking;
import java.util.*;
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        String item = new String();
        if(n == 0)
            return res;
        helper(n, n, item, res);
        return res;
    }
    public void helper(int left, int right, String item, List<String> res){
        if(left > right)
            return;
        if(right == 0 && left == 0){
            res.add(new String(item));
            return;
        }
        if(left > 0){
            helper(left-1, right, item+'(', res);
        }
        if(right > 0){
            helper(left, right-1, item+')', res);
        }
    }
}
