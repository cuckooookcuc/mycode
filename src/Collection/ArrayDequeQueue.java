package Collection;

import java.util.ArrayDeque;

public class ArrayDequeQueue
{
    public static void main(String[] args)
    {
        ArrayDeque queue=new ArrayDeque();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
