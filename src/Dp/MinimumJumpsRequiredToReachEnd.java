package Dp;

import java.util.Arrays;

public class MinimumJumpsRequiredToReachEnd {

    static int calculate(int arr[])
    {

        int dp[]=new int[arr.length];
        int n=arr.length;
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[arr.length-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i+1;j<=i+arr[i] && j<n;j++)
            {
                if(dp[j]!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],1+dp[j]);
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 7};

        System.out.println(calculate(arr));
    }
}
