package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class FrogJumpDP {
    public static void main(String[] args) {
        int [] a = {10,20,30,40,20,10};
        int [] dp = new int[a.length+1];
        Arrays.fill(dp , -1);

        System.out.println(fJDP(a , dp , a.length-1));
    }

    public static int fJDP(int[] a, int[] dp , int i) {
        if(i == 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int leftSide = fJDP(a , dp , i-1) + Math.abs(a[i] - a[i-1]);
        int rightSide = Integer.MAX_VALUE;
        if(i > 1){
            rightSide = fJDP(a , dp , i-2) + Math.abs(a[i] - a[i-2]);
        }

        return dp[i] = Math.min(leftSide , rightSide);
    }
}
