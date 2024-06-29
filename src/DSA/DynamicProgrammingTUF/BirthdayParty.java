package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class BirthdayParty {
    public static void main(String[] args) {
//        int [] A = {2, 4, 6};
//        int [] B = {2, 1, 3};
//        int [] C = {2, 5, 3};

        int [] A = {665,154,269,501,998,992,904,763,254,591,869,843,683,708,410,88,352,566,497,252,486,565,115,585,414,864,23,389,308};
        int [] B = {1,586,973,418,573,193,416,566,815,179,538,406,766,381,807,194,510,894,264,76,111,515,281,675,630,865,807,213,887,914,520,433,501};
        int [] C = {493,570,792,404,985,77,219,883,334,343,649,714,151,561,942,763,825,737,592,340,18,267,688,601,75,900,488,988,421,639,208,632,209};

        int findMax = 0;
        for(int i : A){
            findMax = Math.max(findMax , i);
        }

        int [][] dp = new int [B.length][findMax+1];
        for(int[] i : dp ){
            Arrays.fill(i , -1);
        }

        int ans = 0;
        for(int i : A){
            ans += checkCost( B , C , dp , B.length-1 , i);
        }
        System.out.println(ans);
    }

    public static int checkCost(int[] b, int[] c, int[][] dp, int i, int j) {

        if(j==0){
            return 0;
        }

        if(i < 0 ){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = checkCost(b, c, dp , i-1 , j);
        int left = Integer.MAX_VALUE;
        if(j >= b[i]){
            left = checkCost(b , c , dp , i , j-b[i]) + c[i];
        }

        return dp[i][j] = Math.min(left , right);
    }
}
