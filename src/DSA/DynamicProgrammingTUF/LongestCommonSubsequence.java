package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
//        String A = "abbcdgf";
//        String B = "bbadcgf";

        String A = "aaaaaa";
        String B = "ababab";

        int [][] dp= new int[A.length()][B.length()];

        for(int [] d : dp){
            Arrays.fill(d , -1);
        }

        System.out.println(lcs(A , B , dp , A.length()-1 , B.length()-1));
    }

    public static int lcs(String a, String b, int[][] dp, int i, int j) {
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(a.charAt(i) == b.charAt(j)){
            dp[i][j] = lcs(a , b , dp , i-1, j-1) + 1;
        }
        else{
            dp[i][j] = Math.max(lcs(a , b , dp , i-1, j) , lcs(a , b , dp , i, j-1));
        }

        return dp[i][j];
    }
}
