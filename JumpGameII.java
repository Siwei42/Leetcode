public class JumpGameII {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int max = 0, lastMax = 0, step = 0;
        for(int i = 0; i < nums.length && max >= i; i++){
            if(lastMax < i){
                step++;
                lastMax = max;  
            }
            nums[i] += i;
            if(nums[i] > max)
                max = nums[i];
        }
        if(max < nums.length-1)
            return 0;
        return step;
    }
}