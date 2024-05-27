package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class MinimumSumGrid {
    public static void main(String[] args) {
        int [][]grid = {{1,3,1},
                {1,5,1},
                {4,2,1}};
        int m = grid.length;
        int n = grid[0].length;

        int [][]dp = new int[m][n];
        for(int []a : dp){
            Arrays.fill(a , Integer.MAX_VALUE);
        }

        System.out.println(minimumSum(grid , dp , m-1 , n-1));
    }

    public static int minimumSum(int[][] grid, int[][] dp, int i, int j) {
        if(i==0 && j==0){
            return grid[i][j];
        }

        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }

        int up = minimumSum(grid , dp , i-1 , j);
        int left = minimumSum(grid , dp , i , j-1);
        return dp[i][j] = Math.min(up , left) + grid[i][j];
    }
}
