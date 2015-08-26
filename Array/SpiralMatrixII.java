package Array;
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int k = 1;
        int top=0, bottom=n-1, left=0, right=n-1;

        while(top < bottom && left < right){
            for(int i = left; i < right; i++){
                res[top][i] = k++;
            }
            for(int i = top; i < bottom; i++){
                res[i][right] = k++;
            }
            for(int i = right; i > left; i--){
                res[bottom][i] = k++;
            }
            for(int i = bottom; i > top; i--){
                res[i][left] = k++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        if(n%2 != 0)
            res[n/2][n/2] = k;
        return res;
    }
}