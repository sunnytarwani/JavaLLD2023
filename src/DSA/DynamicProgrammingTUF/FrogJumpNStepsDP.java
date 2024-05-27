package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class FrogJumpNStepsDP {
    public static void main(String[] args) {

        int [] a = {10, 20,30,40,20,10,50,60,40,20,10,60,30,70,30,10,20};
        int k = 2;
        int [] dp = new int [a.length+1];
        Arrays.fill(dp , -1);

        System.out.println(frogJumpNProblem(a , dp , 0 , k));
    }

    public static int frogJumpNProblem(int[] a, int[] dp, int i , int k) {

        if(i == a.length-1){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int minSteps = Integer.MAX_VALUE;
            for(int j = i+1 ; j <= Math.min(a.length-1 ,i+k); j++){
                 int side = frogJumpNProblem(a , dp , j , k) + Math.abs(a[i] - a[j]);
                 minSteps = Math.min(minSteps , side);
            }
        return dp[i] = minSteps;
    }
}
