package Multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProducerConsumer {
    Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>(6);

    int maxiSize =3;

    synchronized void producer(int x) throws InterruptedException {
        while(maxiSize==queue.size())
            wait();

        System.out.println("Produced one element : "+ x);
        queue.add(x);
        notify();


    }

    synchronized void consume() throws InterruptedException{
        while(queue.isEmpty())
            wait();

        System.out.println("Consumed a element : "+ queue.poll());
       // notify();
    }
}
