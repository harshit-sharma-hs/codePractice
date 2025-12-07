package Mojro.SnakeLLD;

public class Solution {

    public static  boolean logicalSequnce(int nums[])
    {
//        StringBuilder sb = new StringBuilder();
//        for(int i:nums)
//        {
//            if(i==0)
//            {
//                sb.append(i);
//            }
//            else if(i==7)
//            {
//                sb.append(i);
//            }
//        }
//        return sb.toString().contains("007");
     //   int left=0;
        int zero=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zero++;
//                if(zero==1)
//                    left=right;
            }
            else if(nums[right]==7)
            {
                if(zero==1)
                {
      //              left=right+1;
                    zero=0;
                }
                else if(zero>=2)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(logicalSequnce(new int[]{0,0,0,0,0,0,3,4,2,5,7,2,0,5,4,3,6,0,7,5,4}));
    }
}
/*
int[] arr = {0,3,4,2,5,7,2,0,5,4,3,6,0,7,5,4}  //07007

int[] arr = {0,3,4,2,5,7,2,0,5,4,3,6,7,7,5,4}   //07077
 */
