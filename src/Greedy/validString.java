package Greedy;

public class validString {

    public static void main(String[] args) {
        String str = "(())()()()()(";

        int maxval = 0;
        int minval = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                maxval++;
                minval++;
            } else if (str.charAt(i) == ')') {
                maxval--;
                minval--;
            } else {
                maxval++;
                minval--;
            }
            if (maxval < 0) {
                System.out.println("false");
                return;
            }

            minval = Math.max(minval, 0);
        }

        System.out.println(minval == 0);

    }

}
