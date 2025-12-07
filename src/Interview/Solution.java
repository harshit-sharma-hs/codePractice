package Interview;

public class Solution {
    static boolean matchPattern(String s, String p)
    {
        int matchingChar=0;
        if(p.equals("*"))
            return true;
        if(p.length()!=s.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(p.charAt(i)=='?')
                matchingChar++;
            if(p.charAt(i)==s.charAt(i))
                matchingChar++;
        }
        return matchingChar==s.length()?true:false;
    }
    public static void main(String[] args) {
        System.out.println(matchPattern("cb","?a"));
    }
}
