public class SearchInsertPostion {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        int min = 0, max = nums.length-1, mid;
        while(min <= max){
            mid = (min + max) / 2;
            if(target > nums[mid])
                min = mid + 1;
            else if(target < nums[mid])
                max =  mid - 1;
            else 
                return mid;
        }
        return min;
    }
}