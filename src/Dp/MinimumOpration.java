package Dp;

public class MinimumOpration {

    static int calculateMinoperation(int n) {
        if (n == 0)
            return 0;
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = n - 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calculateMinoperation(8));
    }
}
