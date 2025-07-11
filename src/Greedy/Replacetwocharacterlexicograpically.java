package Greedy;

import java.util.PriorityQueue;

public class Replacetwocharacterlexicograpically {

    static void findCharacter(String str) {
        char charToReplace = '0';
        char charToreplaceWith = '0';

        PriorityQueue<Character> pq = new PriorityQueue<>();

        for (char c : str.toCharArray()) {
            if (!pq.contains(c))
                pq.add(c);
        }
        for (int i = 0; i < str.length() && !pq.isEmpty(); i++) {
            char c = str.charAt(i);
            if (c > pq.peek()) {
                charToReplace = c;
                charToreplaceWith = pq.peek();
                break;
            } else if (c == pq.peek())
                pq.poll();
        }

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == charToReplace) {
                sb.setCharAt(i, charToreplaceWith);
            } else if (sb.charAt(i) == charToreplaceWith) {
                sb.setCharAt(i, charToReplace);
            }
        }
        System.out.println(sb.toString());


    }

    public static void main(String[] args) {
        String str = "ccab";
        findCharacter(str);
    }
}
