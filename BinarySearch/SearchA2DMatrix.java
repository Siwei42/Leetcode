package BinarySearch;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==n && m==1){
            if(matrix[0][0] == target)
                return true;
            else 
                return false;
        }
            
        int min = 0, max = m-1, mid1=0;
        while(min <= max){
            mid1 = (min + max) / 2;
            if(target > matrix[mid1][n-1])
                min = mid1 + 1;
            if(target == matrix[mid1][0] || target == matrix[mid1][n-1])
                    return true;
            else if(target > matrix[mid1][0] && target < matrix[mid1][n-1])
                break;
            else if(target < matrix[mid1][0])
                max = mid1 -1;
        }
        min = 0; 
        max = n-1;
        int mid2=0;
        while(min <= max){
            mid2 = (min + max) / 2;
            if(target > matrix[mid1][mid2])
                min = mid2 + 1;
            else if(target < matrix[mid1][mid2])
                max = mid2 - 1;
            if(target == matrix[mid1][mid2])
                return true;
        }
        return false;
    }
}
