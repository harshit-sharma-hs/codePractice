package HappiestMinds.R2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Solution {
    static List<List<String>> groupAnagrams(List<String> list){
        HashMap<String,List<String>> map =new HashMap<>();
        for(String str : list)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            if(!map.containsKey(sortedStr))
                map.put(sortedStr,new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        //List<String> ans = new ArrayList<>();

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat","tea","tan","ate","nat","bat");
        System.out.println(groupAnagrams(list));
    }
}
