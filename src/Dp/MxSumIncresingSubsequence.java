package Dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MxSumIncresingSubsequence {

    static int calculate(int arr[]) {
        int ans = 0;
        int sum = 0;
       int dp[]=new int[arr.length];

       for(int i=0;i<arr.length;i++)
           dp[i]=arr[i];

       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<i;j++)
           {
                if(arr[j]<arr[i])
                {
                    dp[i]=Math.max(dp[i],dp[j]+arr[i]);
                }
               ans=Math.max(dp[i],ans);
           }
       }

//        for(int i:dp)
//            ans=Math.max(ans,i);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5 ,3, 2, 4, 7, 9, 8, 2, 3};

        System.out.println(calculate(arr));
    }
}
