package practice;

import java.util.*;

public class abc {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 9;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k)
                res = i + 1;

            if (mp.containsKey(sum - k)) {
                res = Math.max(res, i - mp.get(sum - k));
            } else
                mp.put(sum, i);

        }
        System.out.println(res);

    }
}

