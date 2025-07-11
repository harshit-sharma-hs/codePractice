package Dp;

public class SubsetEqualPartition {

    static boolean equalPartition(int arr[])
    {
        int sum=0;

        for(int i:arr)
            sum+=i;

        if(sum%2!=0)
            return false;

        sum/=2;

        boolean dp[][]=new boolean[arr.length+1][sum+1];

        for(int i=0;i<=arr.length;i++)
            dp[i][0]=true;


        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(j<arr[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }


        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
        int arr[]={1,5,11,5};

        System.out.println(equalPartition(arr));
    }
}
