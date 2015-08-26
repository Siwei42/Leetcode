package Array;
public class TrappingRainWater  {
    public int trap(int[] height) {
        if (height == null || height.length == 0)  
            return 0; 
        int n = height.length;
        int area = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            max = Math.max(height[i], max);
            left[i] = max;
        }
        max = height[n-1];
        right[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            max = Math.max(height[i], max);
            right[i] = max;
        }
        for(int i = 1; i < n; i++){
            area += Math.min(left[i], right[i]) - height[i];
        }
        return area;
    }
}