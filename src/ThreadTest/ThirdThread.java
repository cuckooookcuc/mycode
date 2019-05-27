package ThreadTest;

import java.util.concurrent.FutureTask;

public class ThirdThread
{
    public static void main(String[] args)
    {

//        ThirdThread rt=new ThirdThread();
//        FutureTask<Integer> task=new FutureTask<>((Callable<Integer>)()->
//        {
//           int i=0;
//           for (;i<100;i++)
//           {
//               System.out.println(Thread.currentThread().getName()+"===="+i);
//           }
//           return i;
//        });
        CallableAply ca=new CallableAply();
        FutureTask<Integer> task=new FutureTask<>(ca);
        FutureTask<Integer> task2=new FutureTask<>(ca);

        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"****"+i);
            if (i==20)
            {

                new Thread(task,"有返回值的线程1").start();
                new Thread(task2,"有返回值的线程2").start();

            }
        }
        //??
        try
        {
            System.out.println("子线程的返回值"+"&&&&&&&"+task.get());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
