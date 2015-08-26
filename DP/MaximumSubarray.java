package DP;
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(max_ending_here < 0)
                max_ending_here = 0;
            max_ending_here += nums[i];
            max_so_far = Math.max(max_ending_here, max_so_far);
        }
        return max_so_far;
    }
}