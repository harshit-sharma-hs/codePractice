package Dp;

public class LongestCommonSubstring {

    static int calculate(String str1, String str2) {
        int ans = 0;
        int n = str1.length();
        int m = str2.length();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else
                    dp[i][j] = 0;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";
        System.out.println(calculate(str1,str2));


    }
}
