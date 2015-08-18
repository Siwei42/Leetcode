public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int min = 0, max = nums.length-1, mid;
        if(nums.length == 0 || nums == null)
            return -1;
        while(min <= max){
            mid = (min + max) / 2;
            if(nums[mid] == target)
                return mid;
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
                mid++;
        }
        return -1;
    }
}