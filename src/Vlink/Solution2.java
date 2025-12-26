package Vlink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


//arr = [2,8,9,1,0,18,4,6,5,,5,4,6,4, 6, 7]
//k = 10

public class Solution2 {
    public static List<String> sumEqualK(int []arr,int k)
    {
        List<String> list = new ArrayList<>();
        HashSet<Integer> set =new HashSet<>();

        for(int n:arr)
            set.add(n);

        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(k-arr[i]))
            {
                int a[]=new int[]{arr[i],k-arr[i]};
                Arrays.sort(a);
                String n = Arrays.toString(a);
                if(!list.contains(n))
                     list.add(n);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(sumEqualK(new int[]{2,8,9,1,0,18,4,6,5,5,4,6,4, 6, 7},10));
    }
}
