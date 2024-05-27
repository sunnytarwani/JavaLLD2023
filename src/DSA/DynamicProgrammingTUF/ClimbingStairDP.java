package DSA.DynamicProgrammingTUF;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        int [] dp = new int[a+1];
        Arrays.fill(dp , -1);
        System.out.println(cSDP(a , dp));
    }

    public static int cSDP(int a, int[] dp) {
        if(a<=2){
            return a;
        }
        if(dp[a] != -1){
            return dp[a];
        }

        return dp[a] = cSDP(a-1, dp) + cSDP(a-2 , dp);
    }
}
