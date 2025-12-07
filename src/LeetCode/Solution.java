package LeetCode;

class Solution {
    public static int totalFruit(int[] fruits) {
        int basket1= fruits[0];
        int basket2=fruits[1];
        int maxi = Integer.MIN_VALUE;

        int left = 0;
        int right = 1;

        while(right+1<fruits.length)
        {
            if(fruits[right+1]==basket1 || fruits[right+1]==basket2)
                right++;
            else
            {
                left = right;
                basket2=fruits[right+1];
                right++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        // if(fruits[right]==basket1 || fruits[right]==basket2)
        //        {
        //             right++;
        //             maxi=Math.max(maxi,right-left+1);
        //        }
        return maxi;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,2};
        System.out.println(totalFruit(arr));
    }
}
