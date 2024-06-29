package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class MatchingExpression {
    public static void main(String[] args) {
        String A = "aaa";
        String B = "a*";

        int [][] dp = new int[A.length()][B.length()];
        for(int [] i : dp){
            Arrays.fill(i , -1);
        }

        checkME(A , B , dp, A.length()-1 , B.length()-1);
    }

    public static int checkME(String a, String b, int[][] dp, int i, int j) {

        if(i<0 && j<0){
            return 1;
        }

        if(j < 0){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(a.charAt(i) == b.charAt(j) || b.charAt(j) == '?'){
            dp[i][j] = checkME(a , b , dp , i-1 , j-1);
        }
        if(b.charAt(j) == '*'){

        }

        return dp[i][j];
    }
}
