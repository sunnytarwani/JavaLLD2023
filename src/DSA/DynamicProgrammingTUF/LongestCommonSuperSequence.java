package DSA.DynamicProgrammingTUF;

public class LongestCommonSuperSequence {
    public static void main(String[] args) {
        String s = "brute";
        String t = "groot";

        int n = s.length();
        int m = t.length();

        int [][] dp = new int[n+1][m+1];

        for(int i = 0 ; i<=m ; i++){
            dp[0][i] = 0;
        }
        for(int i = 0 ; i<=n ; i++){
            dp[i][0] = 0;
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }

        int i = s.length();
        int j = t.length();
        StringBuilder ans = new StringBuilder();
        while(i > 0 && j>0){
            if(s.charAt(i-1) == t.charAt(j-1)){
                ans.append(s.charAt(i-1));
                i--;
                j--;
            }
            else if (dp[i-1][j] > dp[i][j-1]){
                ans.append(s.charAt(i-1));
                i--;
            }
            else {
                ans.append(t.charAt(j-1));
                j--;
            }
        }

        while(i>0){
            ans.append(s.charAt(i-1));
            i--;
        }

        while(j>0){
            ans.append(t.charAt(j-1));
            j--;
        }

        System.out.println(ans.reverse().toString());
    }
}
