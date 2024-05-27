package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int [] a = {1,3,2,1};
        int [] dp = new int[a.length+1];
        Arrays.fill(dp , -1);

        System.out.println(houseRobberQ(a , dp , a.length-1));
    }

    public static int houseRobberQ(int[] a, int[] dp, int i) {
        if(i<0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int maxRobbery= Integer.MIN_VALUE;
        for(int j = i ; j >= 0 ; j--){
            maxRobbery = Math.max(a[i] + houseRobberQ(a , dp , i-2)  , houseRobberQ(a , dp , i-1));
        }

        return dp[i] = maxRobbery;
    }
}

