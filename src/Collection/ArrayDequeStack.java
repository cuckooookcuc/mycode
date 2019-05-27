package Collection;

import java.util.ArrayDeque;

public class ArrayDequeStack
{
    public static void main(String[] args)
    {
        ArrayDeque stack=new ArrayDeque();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
