package DSA.DynamicProgrammingTUF;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSumFromAnyPoint {
    public static void main(String[] args) {
        int [][] A = {{1 ,2, 10 ,4},
                {100 ,3 ,2 ,1},
                {1 ,1 ,20 ,2},
                {1 ,2 ,2 ,1}};

        int n = A.length;
        int m = A[0].length;

        int [][] dp = new int[n][m];
        for(int [] a : dp){
            Arrays.fill(a , -1);
        }

//        for(int i = 0 ; i<n ; i++){
//            dp[0][i] = A[0][i];
//        }
//
//        for(int i = 1; i<n ; i++){
//            for(int j = 0 ; j <n ; j++){
//                int up = A[i][j] + dp[i-1][j];
//                int rightDia =  A[i][j] ;
//                if(j+1<n){
//                    rightDia += dp[i-1][j+1];
//                }
//                else{
//                    rightDia += -1;
//                }
//                int leftDia =  A[i][j] ;
//                if(j-1>=0){
//                    rightDia += dp[i-1][j-1];
//                }
//                else{
//                    rightDia += -1;
//                }
//
//                dp[i][j] = Math.max(up , Math.max(rightDia , leftDia));
//            }
//        }
//
//
//        int max = Integer.MIN_VALUE;
//        for(int j = 0 ; j < m ; j++){
//            max = Math.max(max , dp[n-1][j]);
//        }
//        System.out.println(max);


        int max = Integer.MIN_VALUE;
        for(int j = 0 ; j < m ; j++){
            max = Math.max(max , checkSum(n-1 , j , dp , A));
        }

        System.out.println(max);
    }

    public static int checkSum(int i, int j, int[][] dp, int[][] a) {

        if(j < 0 || j >= a[0].length){
            return -1;
        }

        if(i == 0){
            return a[0][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = a[i][j] + checkSum(i-1 , j , dp , a);
        int rightDia =  a[i][j]  + checkSum(i-1 , j-1 , dp , a);
        int leftDia =  a[i][j]  + checkSum(i-1 , j+1 , dp , a);

        return dp[i][j] = Math.max(up , Math.max(rightDia , leftDia));

    }
}
