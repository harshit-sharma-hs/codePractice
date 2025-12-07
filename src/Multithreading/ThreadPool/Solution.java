package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++)
        {
            final int task=i;
            ex.submit(()->{
                System.out.println("Task "+task);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        ex.shutdown();
    }
}
