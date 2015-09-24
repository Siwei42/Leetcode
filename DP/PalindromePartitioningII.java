package DP;

public class PalindromePartitioningII {
	public int minCut(String s) {
        if(s == null && s.length() == 0)
            return 0;
        boolean[][] isPalindrome = getPalindrome(s);
        
        int[] dp = new int[s.length()+1];
        for(int i = 0; i <= s.length(); i++){
            dp[i] = i-1;
        }
        
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if (isPalindrome[j][i - 1]){
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[s.length()];
    }
    public boolean isPalindrome(int start, int end, String s){
        for(int i = start; i < s.length(); i++){
            for(int j = end; j > i; j--){
                if(s.charAt(i) != s.charAt(j))
                    return false;
            }
        }
        return true;
    }
    public boolean[][] getPalindrome(String s){
        boolean[][] dp = new boolean[s.length()+1][s.length()+1];
        
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }
        for(int i = 0; i < s.length()-1; i++){
            dp[i][i+1] = (s.charAt(i) == s.charAt(i+1));
        }
        for(int len = 2; len < s.length(); len++){
            for(int start = 0; start + len < s.length(); start++){
                dp[start][start+len] = dp[start+1][start+len-1] && s.charAt(start) == s.charAt(start+len);
            }
        }
        return dp;
    }
}
