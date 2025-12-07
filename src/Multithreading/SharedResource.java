package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
   int limit;
   Queue<Integer> buffer;

   SharedResource(int limit)
   {
       this.limit=limit;
       buffer=new LinkedList<>();
   }

   synchronized void produce(int item) throws InterruptedException {
       while(buffer.size()==limit)
       {
           wait();
           System.out.println("Producer is waiting");
       }
       buffer.add(item);
       System.out.println(item + " produced");
       notifyAll();
   }
    synchronized void consume() throws InterruptedException {
        while(buffer.isEmpty())
        {
            wait();
            System.out.println("Consumer is waiting");
        }
        int item = buffer.poll();
        System.out.println(item + " Consumed");
        notifyAll();
    }

}
