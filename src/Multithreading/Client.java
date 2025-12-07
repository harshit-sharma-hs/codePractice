package Multithreading;

import java.util.LinkedList;
import java.util.Queue;
class Client{
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(3);

        Thread t1 =new Thread(()->{
            for(int i=0;i<6;i++)
            {
                try {
                    sharedResource.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 =new Thread(()->{
            for(int i=0;i<6;i++)
            {
                try {
                    sharedResource.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }

}