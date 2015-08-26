package Array;
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1, max = 0;
        while(low < high){  
            int area = (high-low) * Math.min(height[low], height[high]);
            max = Math.max(area, max);
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}