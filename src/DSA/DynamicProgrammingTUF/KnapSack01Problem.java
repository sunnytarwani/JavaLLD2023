package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class KnapSack01Problem {
    public static void main(String[] args) {
        int [] A = {60, 100, 120};
        int [] B = {10, 20, 30};
        int C = 50;

        int [][] dp =new int[A.length][C+1];

        for(int [] a : dp){
            Arrays.fill(a , -1);
        }

        System.out.println(knapSack(A , B , dp , C , A.length-1 ));
    }

    public static int knapSack(int[] a, int[] b, int[][] dp, int c, int i) {

        if(i < 0 || c == 0 ){
//            if(c >= b[0]){
//                return a[0];
//            }
            return 0;
        }

        if(dp[i][c] != -1){
            return dp[i][c];
        }

        int left = 0;
        if(b[i] <= c){
            left = knapSack(a , b , dp , c-b[i] , i-1) + a[i];
        }
        int right = knapSack(a , b , dp , c , i-1);

        return dp[i][c] = Math.max(right , left);
    }
}
