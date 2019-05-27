package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList linkedList=new LinkedList();
        linkedList.offer("1");
        linkedList.push("2");
        linkedList.offerFirst("3");
        for (int i=0;i<linkedList.size();i++)
        {
            System.out.println(linkedList.get(i));
        }
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);


    }
}
