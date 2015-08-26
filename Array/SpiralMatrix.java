package Array;
import java.util.*;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return res;
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==1 && n==1){
            res.add(1);
            return res;
        }
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(top < bottom && left < right){
            
            for(int i = left; i < right; i++)
                res.add(matrix[top][i]);
            for(int i = top; i < bottom; i++)
                res.add(matrix[i][right]);
            for(int i = right; i > left; i--)
                res.add(matrix[bottom][i]);
            for(int i = bottom; i > top; i--)
                res.add(matrix[i][left]);
            top++;
            bottom--;
            left++;
            right--;
        }
        if(bottom > top && right ==left){
            for(int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
        }
        if(right > left && bottom == top){
            for(int i = left; i <= right; i++)
                res.add(matrix[top][i]);
        }
        if(m==n && m%2 != 0)
             res.add(matrix[top][left]);
        return res; 
    }
}