package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class BuyingCandies {
    public static void main(String[] args) {
//        int [] A = {1, 2, 3};
//        int [] B = {2, 2, 10};
//        int [] C = {2, 3, 9};
//        int D = 8;

        int [] A = {2};
        int [] B = {5};
        int [] C = {10};
        int D = 99;

        int [] totalSweetness = new int[A.length];
        for(int i = 0 ; i < A.length; i++){
            totalSweetness[i] = A[i]*B[i];
        }

        int [][] dp = new int [A.length][D+1];

        for(int i [] : dp){
            Arrays.fill(i , -1);
        }

        System.out.println(totalCostCandies(C , totalSweetness , dp , A.length-1 , D));
    }

    public static int totalCostCandies(int[] c, int[] totalSweetness, int[][] dp, int i, int d) {
        if(i<0){
            return 0;
        }
        if(dp[i][d] != -1){
            return dp[i][d];
        }

        int left = 0;
        if(d >= c[i]){
            left = totalCostCandies(c , totalSweetness , dp , i , d-c[i]) + totalSweetness[i];
        }
        int right = totalCostCandies(c , totalSweetness ,dp , i-1 , d);

        return dp[i][d] = Math.max(left , right);
    }
}
