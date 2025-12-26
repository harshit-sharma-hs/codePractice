package ThreadPractice;

import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Prac t1 = new Prac();

        ExecutorService executors = Executors.newSingleThreadExecutor();
        Future<String> f = executors.submit(t1);
        System.out.println(f.get());
//        Comparator comp= Comparator.comparing(Integer::intValue).thenComparing(Integer)

    }
}


