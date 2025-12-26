package HappiestMinds;

/*
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
public class Solution2 {
    public static int minSubarray(int arr[],int target)
    {
        int left=0;
        int sum =0;
        int minLength = Integer.MAX_VALUE;
        for(int right =0;right<arr.length;right++)
        {
            sum+=arr[right];
            if(sum>=target)
            {
                if(minLength>right-left+1)
                {
                    minLength=right-left+1;
                }
                sum=0;
                left=right+1;
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        System.out.println(minSubarray(new int[]{2,3,1,2,4,3},7));
    }
}
