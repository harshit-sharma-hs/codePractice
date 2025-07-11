package Dp;

import java.util.Arrays;
import java.util.Comparator;

public class MaimumlengthChainPairs {

    static int calculatemaximumsubsequence(int[][] arr, int n) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int ans = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > prev) {
                ans++;
                prev = arr[i][1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[][] = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}};

        System.out.println(calculatemaximumsubsequence(arr, n));
    }
}
