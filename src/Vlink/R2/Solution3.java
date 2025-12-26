package Vlink.R2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Find the second highest salary using Java 8 Stream
Find out the numbers starting with 1 using java 8
Find duplicate elements using java 8

List<Integer> salaries = Arrays.asList(10000, 5000, 8000, 3000, 12000, 8000, 15000);
 */
public class Solution3 {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(10000, 5000, 8000, 3000, 12000, 8000, 15000);

        Optional<Integer> secondHighest = salaries.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
        System.out.println(secondHighest.get());

        //salaries.stream().
    }
}
