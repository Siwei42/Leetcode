package Array;
import java.util.*;
public class ThreeSumClosest  {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2;i++){
               int low = i+1;
               int high = nums.length-1;
               while(low<high){
                    int sum = nums[i]+nums[low]+nums[high];
                    if(Math.abs(target-sum) < min){
                        min = Math.abs(target-sum);
                        res = sum;
                    }
                    if(target == sum)
                        return res;
                    else if(target > sum)
                        low++;
                    else
                        high--;
               }
        }
        return res;
    }
}