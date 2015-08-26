package Array;
import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 0;
        for(int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        while(!set.isEmpty()){
            Iterator iterator = set.iterator();
            int i = (int)iterator.next();
            set.remove(i);
            int count = 1;
            int j = i-1;
            while(set.contains(j)){
                count++;
                set.remove(j--);
            }
            j = i+1;
            while(set.contains(j)){
                count++;
                set.remove(j++);
            }
            if(count > max)
                max = count;
        }
        return max;
    }
}