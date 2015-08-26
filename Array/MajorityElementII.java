package Array;
import java.util.*;
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int candidates1 = 0, candidates2 = 0;
        int count1 = 0, count2 = 0;
        if (nums == null) {
            return res;
        }
        for(int i = 0; i < nums.length; i++){
            if(count1 > 0 && count2 > 0){
                if(nums[i] == candidates1)
                    count1++;
                else if(nums[i] == candidates2)
                    count2++;
                else{
                    count1--; count2--;
                }
            }
            else if(count1 > 0){
                if(nums[i] == candidates1)
                    count1++;
                else{
                    candidates2 = nums[i];
                    count2++;
                }
            }
            else if(count2 > 0){
                if(nums[i] == candidates2)
                    count2++;
                else{
                    candidates1 = nums[i];
                    count1++;
                }
            }
            else{
                candidates1 = nums[i];
                count1++;
            }
        }
        
        count1 = 0; count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidates1)
                count1++;
            else if(nums[i] == candidates2)
                count2++;
        }
        if(count1 > nums.length / 3)
            res.add(candidates1);
        if(count2 > nums.length / 3)
            res.add(candidates2); 

        return res;
    }
}