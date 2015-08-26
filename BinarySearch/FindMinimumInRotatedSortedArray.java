package BinarySearch;
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int min = 0, max = nums.length-1, mid;
        while(min < max && nums[min] >= nums[max]){
            mid = (min + max) / 2;
            if(nums[mid] > nums[max])
                min = mid + 1;
            else   
                max = mid;
        }
        return nums[min];
    }
}