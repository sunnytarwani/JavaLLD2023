package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class EditStringDistance {
    public static void main(String[] args) {
        String A = "Anshuman";
        String B = "Antihuman";

        int [][] dp = new int [A.length()][B.length()];
        for(int [] d : dp){
            Arrays.fill(d , Integer.MAX_VALUE);
        }

        System.out.println(eSD(A , B, dp , A.length()-1 , B.length()-1 ));
    }

    public static int eSD(String a, String b, int[][] dp, int i, int j) {
        if(i < 0 ){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }

        if(a.charAt(i) == b.charAt(j)){
            dp[i][j] = eSD(a , b , dp , i-1 , j-1);
        }
        else{
            int alpha = Math.min(eSD(a , b , dp , i , j-1) , eSD(a , b , dp , i-1 , j-1));
            dp[i][j] = Math.min(eSD(a , b , dp , i-1 , j) , alpha) + 1;
        }

        return dp[i][j];
    }
}
