package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

    static void findduplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }

        for (int i : list)
            System.out.println(i);


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 7, 8, 9};

        findduplicates(arr);
    }
}
