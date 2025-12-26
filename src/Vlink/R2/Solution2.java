package Vlink.R2;


/*Find Missing Number in Array
Input: [1, 2, 4, 5, 6]
Output: 3*/


public class Solution2 {

    public static int missingNumber(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 2, 4, 5, 6}));
    }
}
