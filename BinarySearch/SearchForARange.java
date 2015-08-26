package BinarySearch;
public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if(nums == null || nums.length == 0)
            return res;
        int min = 0, max = nums.length-1, temp = 0;
        while(min <= max){
            int mid = (min + max) / 2;
            temp = mid;
            if(nums[mid] == target){
                res[0] = mid;
                res[1] = mid;
                break;
            }
            else if(nums[mid] > target)
                max = mid - 1;
            else
                min = mid + 1;
        }
        if(nums[temp] != target)
            return res;
        //find the left bound
        min = 0; max = temp;
        while(min <= max ){
            int mid = (min + max) / 2;
            if(nums[mid] == target)
                max = mid - 1;
            else
                min = mid + 1;
        }
        res[0] = min;
        //find the right bound
        min = temp; max = nums.length-1;
        while(min <= max){
            int mid = (min + max) / 2;
            if(nums[mid] == target)
                min = mid + 1;
            else
                max = mid - 1;
        }
        res[1] = max;
        
        return res;
    }
}