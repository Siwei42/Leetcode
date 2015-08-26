package Array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return nums.length;
        int length = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                if(nums[length] != nums[i])
                    nums[length] = nums[i];
                length++;
            }    
        }
        return length;
    }
}