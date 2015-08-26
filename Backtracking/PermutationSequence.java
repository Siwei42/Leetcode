package Backtracking;
import java.util.*;
public class PermutationSequence {
	public String getPermutation(int n, int k) {
        k--;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)
            list.add(i);
        int factorial = 1;
        for(int i = 2; i < n; i++)
            factorial *= i;
        StringBuilder res = new StringBuilder();
        int times = n-1;
        while(times>=0){
            int indexInList = k / factorial;
            res.append(list.get(indexInList));  
            list.remove(indexInList);  
            k = k % factorial;
            if(times!=0)
                factorial = factorial / times;
            times--;
        }
        
        return res.toString();
    }
    public static void main(String[] args){
	    PermutationSequence ps = new PermutationSequence();
	    System.out.println(ps.getPermutation(9, 331987));
    }
}
