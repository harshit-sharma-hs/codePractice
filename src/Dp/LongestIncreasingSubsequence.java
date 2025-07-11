package Dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

    static int calculate(int arr[])
    {
        int n =arr.length;
        int dp[] = new int[n];
        int ans = 0;
//        Arrays.fill(dp,1);
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                if(arr[j]<arr[i])
//                {
//                  dp[i]=Math.max(dp[i],dp[j]+1);
//                }
//
//            }
//            ans =Math.max(ans,dp[i]);
//        }

        List<Integer> ls =new ArrayList<>();
        for(int i:arr)
        {
            int idx = Collections.binarySearch(ls,i);

            if(idx<0)
            {
                idx=-idx-1;
            }

                if(idx==ls.size())
                    ls.add(i);
                else
                    ls.set(idx,i);


        }

        return ls.size();
    }
    public static void main(String[] args) {
        int arr[] = {36 ,37, 43, 64, 8, 78, 90, 74};

        System.out.println(calculate(arr));
    }
}
