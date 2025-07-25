package practice;

public class LongestIncreasingSubsequence {


    static int LIS(int arr[]) {

        int ans = 0;
        int dp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 8, 9};
        System.out.println(LIS(arr));
    }
}
