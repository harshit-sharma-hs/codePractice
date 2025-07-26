package Dp;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int oddLen = helper(s, i, i);
            int evenLen = helper(s, i, i + 1);
            int len = Math.max(oddLen, evenLen);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }

        return s.substring(start, end + 1);
    }

    int helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
