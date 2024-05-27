package DSA.DynamicProgrammingTUF;

import java.util.Arrays;


class UniqueGrid1 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int [][] dp = new int[m][n];
        for(int [] A : dp){
            Arrays.fill(A ,-1);
        }
        System.out.println(uPDP(m-1 , n-1 , dp));
    }
    public static int uPDP(int i , int j , int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = uPDP(i , j-1 , dp);
        int left = uPDP(i-1 , j , dp);

        return dp[i][j] = up + left;
    }

}
