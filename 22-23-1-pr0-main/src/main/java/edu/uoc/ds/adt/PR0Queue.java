package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }

    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        Integer[] firstPrimeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < CAPACITY; i++) {
            queue.add(firstPrimeNumbers[i]);
        }
    }


    public Integer clearFullQueue() {
        Integer sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }
        return sum;
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
