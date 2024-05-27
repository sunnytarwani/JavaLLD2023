package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class UnboundedKnapSack {
    public static void main(String[] args) {
        int A = 10;
        int [] B = {6, 7};
        int  [] C = {5, 5};

        int [][] dp = new int[B.length][A+1];

        for(int [] a:dp){
            Arrays.fill(a , -1);
        }

        System.out.println(unboundedKnapSack(B , C , dp , B.length-1 , A));
    }

    public static int unboundedKnapSack(int[] b, int[] c, int[][] dp, int i, int a) {

        if(i < 0 || a == 0){
            return 0;
        }

        if(dp[i][a] != -1){
            return dp[i][a];
        }

        int left = 0;
        if(a >= c[i]){
            left= unboundedKnapSack(b , c, dp , i , a-c[i]) + b[i];
        }
        int right = unboundedKnapSack(b , c, dp , i-1 , a);

        return dp[i][a] = Math.max(right , left);
    }
}
