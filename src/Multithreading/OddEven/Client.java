package Multithreading.OddEven;

public class Client {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource(10);

        Thread t1 =new Thread(()->{
            try {
                sharedResource.Even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 =new Thread(()->{
            try {
                sharedResource.Odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
