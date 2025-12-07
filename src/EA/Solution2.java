package EA;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(maxSubarry(new int[]{100, 10, 2, 7, 1, -10},15));
    }

    static int maxSubarry(int arr[],int k)
    {
//        int maxLength=Integer.MIN_VALUE;
//        int sum=0;
//        int start =0;
//        int end = 0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sum+=arr[i];
//            if(sum==k) {
//                end=i;
//                if(maxLength<end-start+1) {
//                    maxLength=end-start+1;
//                }
//            }
//        }
//        System.out.println(start + " "+ end );
//        return maxLength==Integer.MIN_VALUE?0:maxLength;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int start = 0;
        int end = 0;
        int maxLength=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            System.out.println(sum);
            if (sum == k){
                maxLength = Math.max(maxLength,i+1);
            }
            if(map.containsKey(sum))
                maxLength=Math.max(maxLength,i-map.get(sum));

            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return maxLength;

    }
}
