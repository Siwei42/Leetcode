package BinarySearch;
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int min = 0, max = nums.length-1, mid;
        if(nums.length == 1)
            return 0;
        while(min < max){
            mid = (min + max) / 2;
            if(nums[mid] < nums[mid+1])
                min = mid+1;
            else
                max = mid;
        }
        return min;
    }
    
    public int findPeakElement2(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int min = 0, max = nums.length-1, mid;
        while(min+1 < max){
            mid = (min + max) / 2;
            if(nums[mid] > nums[mid-1])
                min = mid;
            else 
                max = mid;
        }
        if(nums[min] < nums[max])
            return max;
        else
            return min;
    }
}