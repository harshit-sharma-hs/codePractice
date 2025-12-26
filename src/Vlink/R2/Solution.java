package Vlink.R2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static char firstNonRepeating(String str)
    {
        int arr[] = new int[26];
        for(char c : str.toCharArray())
            arr[c-'a']++;

        for(char c : str.toCharArray())
            if(arr[c-'a']==1)
                return c;

        return '0';
    }
    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));
    }
}

