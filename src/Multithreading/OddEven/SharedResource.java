package Multithreading.OddEven;

public class SharedResource {
    int counter;
    int limit;

    SharedResource(int limit)
    {
        this.limit=10;
        this.counter=1;
    }

    synchronized void Odd() throws InterruptedException {
        while(counter<limit)
        {
            if(counter%2==0)
            {
                wait();
                System.out.println("Odd thread waiting");
            }
            System.out.println("Odd Number :"+counter);
            counter++;
            notifyAll();
        }
    }
    synchronized void Even() throws InterruptedException {
        while(counter<limit)
        {
            if(counter%2!=0)
            {
                wait();
                System.out.println("Even thread waiting");
            }
            System.out.println("Even Number :"+counter);
            counter++;
            notifyAll();
        }
    }

}
