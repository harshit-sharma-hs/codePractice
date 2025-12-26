package Vlink;

public class Client {
    public static void main(String[] args) {
        SharedResource sharedResource =new SharedResource(10);

        Thread t1 =new Thread(()->{
            try {
                sharedResource.isEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 =new Thread(()->{
            try {
                sharedResource.isOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

    }
}
