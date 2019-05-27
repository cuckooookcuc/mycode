package ThreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest
{
    public static void main(String[] args)
    {
        ExecutorService pool= Executors.newFixedThreadPool(6);
//        Runnable target=()->{
//            for (int i=0;i<100;i++)
//            {
//                System.out.println(Thread.currentThread().getName()+"==="+i);
//            }
//        };
        SmallTest target=new SmallTest();
        pool.submit(target);
        pool.submit(target);
        pool.shutdown();
    }
}
 class SmallTest implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}
