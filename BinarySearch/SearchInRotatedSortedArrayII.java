package BinarySearch;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int min = 0, max = nums.length-1, mid;
        if(nums.length == 0 || nums == null)
            return false;
        while(min <= max){
            mid = (min + max) / 2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] < nums[max]){
                if(target > nums[mid] && target <= nums[max])
                    min = mid + 1;
                else
                    max = mid - 1;
            }
            else if(nums[mid] > nums[max]){
                if(target < nums[mid] && target >= nums[min])
                    max = mid - 1;
                else
                    min = mid + 1;
            }
            else
                max--;
        }
        return false;
    }
}