package DP;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(m == 0 && n == 0)
            return 0;
        if(m==1 & n==1)
            return grid[0][0];
        int[][] paths = new int[m][n];
        paths[0][0] = grid[0][0];
        for(int i = 1; i < m; i++)
            paths[i][0] = paths[i-1][0] + grid[i][0];
        for(int i = 1; i < n; i++)
            paths[0][i] = paths[0][i-1] + grid[0][i];

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(paths[i-1][j] < paths[i][j-1])
                    paths[i][j] = paths[i-1][j] + grid[i][j];
                else
                    paths[i][j] = paths[i][j-1] + grid[i][j];
            }
        }
        return paths[m-1][n-1];
    }
}
