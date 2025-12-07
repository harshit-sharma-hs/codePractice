package Osttra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it =list.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
