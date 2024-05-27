package DSA.DynamicProgrammingTUF;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        int [] dp = new int [a+1];
        Arrays.fill(dp, -1);
        System.out.println(fBS(a , dp));
    }

    public static int fBS(int a, int[] dp) {

        if(a<=1){
            return a;
        }
        if(dp[a] != -1){
            return dp[a];
        }

        return dp[a] = fBS(a-1 , dp ) + fBS(a-2 , dp);
    }
}
