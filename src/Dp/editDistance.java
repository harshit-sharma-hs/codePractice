package Dp;

public class editDistance {

    static int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();


        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = i;

        for (int j = 0; j <= m; j++)
            dp[0][j] = j;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcfe";

        System.out.println(editDistance(s1, s2));
    }
}
