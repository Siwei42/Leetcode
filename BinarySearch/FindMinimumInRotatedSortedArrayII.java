package BinarySearch;
public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int min = 0, max = nums.length-1, mid = 0;
        while(min < max && nums[min] >= nums[max]){
            mid = (min + max) / 2;
            if(nums[mid] > nums[max])
                min = mid + 1;
            else if(nums[mid] < nums[max])
                max = mid;
            else
                min++;
        }
        return nums[min];
    }
}