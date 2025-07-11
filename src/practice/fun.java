package practice;

import java.util.Arrays;
import java.util.Comparator;

public class fun {

    public static void main(String[] args) {
        String arr[]={"dcsdcs","f","sffggfegetge"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
