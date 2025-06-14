import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ByZeroException extends RuntimeException {
    public ByZeroException(String m) {
        super(m);
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ByZeroException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hhdbdbhc");
    }

    static int check() {
        int a = 1;
        int b = 0;
        int x = a / b;
        if (b == 0)
            throw new ByZeroException("by 0 exception");
        System.out.println("divide");
        return 0;
    }
}



