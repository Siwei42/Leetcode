package Array;
public class SortColors {
    public void sortColors(int[] nums) {
        
        int notRed=0, notBlue=nums.length-1, cur;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                notRed = i;
                break;
            }    
        }
        for(int i = nums.length-1 ; i >= 0; i--){
            if(nums[i] != 2){
                notBlue = i;
                break;
            }    
        }
        cur = notRed;
        int temp;
        while(cur <= notBlue){
            if(nums[cur] == 0){
                swap(nums, cur, notRed);
                notRed++;
                cur++;
            }
            else if(nums[cur] == 1)
                cur++;
            else{
                swap(nums, cur, notBlue);
                notBlue--;
            }
            
        }
        
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}