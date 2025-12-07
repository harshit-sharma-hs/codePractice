package practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
//        List<List<Integer>> list =  Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8)
//        );
//        HashMap<String,List<String>> data =new HashMap<>();
//
//        data.put("ravi",Arrays.asList("kk","sss","saasas"));
//        data.put("avi",Arrays.asList("kcdsc","scsdcs","saaswqwqas"));
//        data.put("Lavi",Arrays.asList("kddck","ssdcsdsc","scaawqwaasas"));

//        for(String key: data.keySet())
//        {
//               data.get(key).stream().forEach(n-> System.out.println(n));
//        }
//        list.stream()
//                //.filter(n->n%2==0)
//                .distinct()
//                .map(n->n*2)
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .limit(1)
//                .forEach(n-> System.out.println(n));
//        list.stream()
//                .flatMap(Collection::stream).forEach(n-> System.out.println(n));
        List<Integer> list = Arrays.asList(10,16,17,35,42,5,5,6,7,7,8,6,6,5);
        int maxi = list.stream().max((Comparator.comparingInt(Integer::intValue))).get();
        Optional<Integer> ma = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        List<Integer> l2= list.stream().distinct().collect(Collectors.toList());
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        long count = list.stream().count();
        int product = list.stream().reduce(1,(a,b)->a*b);
        Map<Integer,Long> freqMap = list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
        System.out.println(freqMap);
        System.out.println(product);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(l2);
        System.out.println(ma.get());
        System.out.println(maxi);
        List<String> slist = Arrays.asList("aacaaacs","bscacaca","ccdcd","dfdfd","acs");

        List<String> sortList = slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> lList = slist.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());

        System.out.println(lList);

        System.out.println(sortList);

    }
}
