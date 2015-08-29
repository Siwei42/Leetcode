package DP;

public class DistinctSubsequences {
	public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length()+1][s.length()+1];
        dp[0][0] = 1;
        for(int i = 1; i < s.length()+1; i++)
            dp[0][i] = 1;
        for(int i = 1; i < t.length()+1; i++)
            dp[i][0] = 0;   
        for(int i = 1; i < s.length()+1; i++){
            for(int j = 1; j < t.length()+1; j++){
                dp[j][i] = dp[j][i-1];
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[j][i] += dp[j-1][i-1];
            }
        }
        return dp[t.length()][s.length()];
    }
	public static void main(String[] args){
		DistinctSubsequences nd = new DistinctSubsequences();
		System.out.println(nd.numDistinct("rabbbit", "rabbit"));
	}
}
