package Vlink;

public class SharedResource {
    int counter;
    int limit;

    SharedResource(int limit)
    {
        this.limit=limit;
        this.counter=0;
    }

    synchronized void isEven() throws InterruptedException {
        while(counter<limit)
        {
            if(counter%2!=0)
            {
                System.out.println("Even thread waiting");
                wait();
            }
            System.out.println("Even number "+counter);
            counter++;
            notify();
        }
    }
    synchronized void isOdd() throws InterruptedException {
        while(counter<limit)
        {
            if(counter%2==0)
            {
                System.out.println("Odd thread waiting");
                wait();
            }
            System.out.println("Odd number "+counter);
            counter++;
            notify();
        }
    }

}
