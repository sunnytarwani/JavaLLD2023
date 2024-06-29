package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class CuttingRod {
    public static void main(String[] args) {
        int []  A = {3, 4, 1, 6, 2};

        int[][] dp=new int[A.length][A.length+1];

        for(int []i: dp){
            Arrays.fill(i , -1);
        }

        System.out.println(cutRod(A , dp , A.length-1 , A.length));
    }

    public static int cutRod(int[] a, int[][] dp, int i, int j) {
        if(j==0){
            return 0;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int left = 0;
        if(j >=i+1){
            left = cutRod(a , dp , i , j - (i+1)) + a[i];
        }

        int right = cutRod(a , dp , i-1 , j );

        return dp[i][j] = Math.max(left , right);
    }
}
