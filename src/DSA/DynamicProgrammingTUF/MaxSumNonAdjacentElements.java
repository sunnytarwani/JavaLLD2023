package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class MaxSumNonAdjacentElements {
    public static void main(String[] args) {

        int [] a = {2,1,4,9};
        int [] dp = new int [a.length+1];
        Arrays.fill(dp,-1);
        System.out.println(sumCheckAdjacentEle(dp ,a , a.length-1));
    }

    public static int sumCheckAdjacentEle(int[] dp, int[] a, int i) {

        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int j = i ; j >= 0 ; j--){
            int includeCurrent = sumCheckAdjacentEle(dp , a , i-2) + a[i];
            int excludeCurrent = sumCheckAdjacentEle(dp, a, i - 1);
            maxSum = Math.max(includeCurrent , excludeCurrent);
        }
        return dp[i] = maxSum;
    }
}
