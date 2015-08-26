package Array;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length < 2)
            return result;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(target-nums[i]))
                map.put(nums[i], i);
            else{ 
                result[0] = map.get(target-nums[i]) + 1;
                result[1] = i + 1;
                break;
            }    
        }
        return result;
    }
}