package Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumToys {

    static int calculate(int k, int arr[])
    {

        Arrays.sort(arr);
        int ans=0;

        for(int i:arr)
        {
            if(ans+i>k)
                return ans;
            else
                ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int k =50;
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};

        System.out.println(calculate(k,arr));
    }
}
