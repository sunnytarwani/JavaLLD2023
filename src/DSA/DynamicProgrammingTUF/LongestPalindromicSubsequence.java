package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        //String A = "bebeeed";

        String A = "aedsead";

        int [][] dp = new int[A.length()][A.length()];

        for(int [] d : dp){
            Arrays.fill(d , -1);
        }
        System.out.println(lps(A , 0 , A.length()-1 , dp));
    }

    public static int lps(String a, int i, int j, int[][] dp) {
        if(j<0 || i >= a.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(a.charAt(i) == a.charAt(j)){
            dp[i][j] = lps(a , i+1 , j-1 , dp) + 1;
        }
        else{
            dp[i][j] = Math.max(lps(a , i+1 ,j , dp) , lps(a , i , j-1 , dp));
        }

        return dp[i][j];
    }
}
