package HappiestMinds;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of employees. Return a map with key as the first letter of the name and value as list of names starting with that letter.

output -)'A'["Alice", "Andrew"]
'B'["Bob", "Brenda"]
'C'["Charlie", "Cathy"]
input - [Alice,Bob,Charlie,Andrew,Brenda,Cathy]
 */
public class Solution {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice","Bob","Charlie","Andrew","Brenda","Cathy");

        Map<Character,List<String>> mp = list.stream().collect(Collectors.groupingBy(n->n.charAt(0)));
        System.out.println(mp);
    }
}
