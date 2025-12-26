package HappiestMinds.R3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2,4,5,6,7,8,43,2};
//        int[] reversedArray = IntStream.range(0, arr.length)
//                .map(i -> arr[arr.length - 1 - i])
//                .toArray();
        //Arrays.sort(arr,(a,b)->b-a));
        Integer[] sortedDesc = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);
        for (int i :sortedDesc)
            System.out.println(i);
    }
}
