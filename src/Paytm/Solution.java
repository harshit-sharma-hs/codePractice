package Paytm;


import java.util.Arrays;

/*
Input: piles = [3,6,7,11], h = 8
Output: 4

* */
public class Solution {

    public static int minimumHour(int arr[],int h)
    {
        Arrays.sort(arr);    //3 6 7 11   3+4=7 3+2 6-3=3/2=
        int n= arr.length;
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int mid=arr[low]+(arr[high]-arr[low])/2;
            int totalHour  = calculate(arr,mid);
            if(totalHour==h)
            {
                return mid;
            }
            else if (totalHour<h)
            {
                high--;
            }
            else
                low++;
        }

        return -1;
    }
    static int calculate(int arr[],int hr)
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]>0)
            {
                arr[i]-=hr;
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(minimumHour(new int[]{3,6,7,11},8));
    }
}
