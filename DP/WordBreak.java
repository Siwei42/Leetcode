package DP;
import java.util.*;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> wordDict) {
        if(s == null || s.length() == 0)
            return true;
        int maxLen = 0;
        for(String word : wordDict){
            maxLen = Math.max(word.length(), maxLen);
        }
        
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        
        for(int i = 1; i <= s.length(); i++){
            dp[i] = false;
            //j is last word length
            for(int j = 1; j <= maxLen && j <= i; j++){
                if(dp[i-j] && wordDict.contains(s.substring(i-j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
	
	public static void main(String[] args){
		WordBreak wb = new WordBreak();
		Set<String> set = new HashSet<String>();
		set.add("a");
		System.out.println(wb.wordBreak("a", set));
	}
}
