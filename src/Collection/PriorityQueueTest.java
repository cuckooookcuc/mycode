package Collection;

import java.util.PriorityQueue;

public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(12);
        priorityQueue.offer(32);
        priorityQueue.offer(3);
        priorityQueue.offer(23);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
    }
}
