package Multithreading;

public class Main {
    public static void main(String[] args) {

//        Thread T1 = new Thread (()->{
//            System.out.println("dsjbjhcbshb");
//        },"Thread-1");
//
//
//        Thread T2 = new Thread (()->{
//            System.out.println(Thread.currentThread().getName()+"    dsjbjhcbshb");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        },"Thread 2");
//
//        T1.start();
//        T2.start();
//        try{
//            T2.join();
//        }
//        catch (Exception e)
//        {
//            //ncskjdcnsk;
//        }

        ProducerConsumer obj = new ProducerConsumer();


            Thread t1 = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started");
                for(int i=1;i<=6;i++) {
                    try {
                    //    Thread.sleep(2000);
                        obj.producer(i);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            Thread t2 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+ " started");
                for(int i=1;i<=6;i++) {
                    try {
                        Thread.sleep(2000);
                        obj.consume();
                       // Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            t1.start();
            t2.start();
        }

}
