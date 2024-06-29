package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String A = "abcdxyz";
        String B = "xyzabcd";

        int [][] dp = new int[A.length()+1][B.length()+1];

        int ans = 0;
         for(int i = 1 ; i <= A.length() ; i++){
             for(int j = 1 ; j<= B.length() ; j++){
                 if(A.charAt(i-1) == B.charAt(j-1)){
                     dp[i][j] = dp[i-1][j-1] + 1;
                     ans = Math.max(ans , dp[i][j]);
                 }
                 else{
                     dp[i][j] = 0;
                 }
             }
         }

        System.out.println(ans);
    }
}
