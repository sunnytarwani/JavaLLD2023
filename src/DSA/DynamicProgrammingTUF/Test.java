package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int [][]A = {
//        {0, 0, 0},
//        {0, 1, 0},
//        {0, 0, 0}};
        int [][]A = {
                {1,0,1,0},
                {0, 1, 0},
                {0, 0, 0}};

        int [][]dp = new int[A.length][A[0].length];
        for(int [] d  : dp){
            Arrays.fill(d , -1);
        }

        System.out.println(checkMinSum(A , dp , A.length-1 , A[0].length-1));
    }

    public static int checkMinSum(int[][] a, int[][] dp, int i, int j) {

        if(i == 0 && j ==0 && a[i][j] != 1){
            return 1;
        }

        if(i < 0 || j < 0 || a[i][j] == 1){
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }

        return dp[i][j] = checkMinSum(a , dp , i , j-1) + checkMinSum(a , dp , i-1 , j);
    }
}
