package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class UniqueGrid2 {
    public static void main(String[] args) {
        int [][] A = {{0,0,0}
                ,{0,1,0},
                {0,0,0}};

        int m = A.length;
        int n = A[0].length;

        int [][] dp = new int[m][n];

        for(int []a :dp){
            Arrays.fill(a , -1);
        }

        System.out.println(uniquePathObstacle(dp , A , m-1 , n-1));
    }

    public static int uniquePathObstacle(int[][] dp, int[][] a, int i, int j) {
        if(i == 0 && j==0 ){
            return 1;
        }
        if(i < 0 || j<0 || a[i][j] == 1 ){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = uniquePathObstacle(dp , a , i , j-1);
        int left = uniquePathObstacle(dp , a , i-1 , j);

        return dp[i][j] = up+left;
    }
}
