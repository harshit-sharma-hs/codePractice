package Genpact;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*

 */
public class Solution {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(3,2,5,6,2,4,1);

           Optional<Integer> arrSum =  list.stream().filter(n->n%2==0).map(n->n*n).reduce((a, b)->a+b);
           System.out.println(arrSum.get());

        }
}
