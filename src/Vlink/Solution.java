package Vlink;


//string s = "leetcode"
public class Solution {
    public static char nonRepeating(String str)
    {
        int arr[] = new int[26];

        for(char c: str.toCharArray())
            arr[c-'a']++;

        for(char c: str.toCharArray())
        {
            if(arr[c-'a']==1)
                return c;
        }
        return '*';
    }

    public static void main(String[] args) {
        System.out.println(nonRepeating("leetcode"));
    }
}
