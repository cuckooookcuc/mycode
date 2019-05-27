package ThreadTest;

public class JoinThread extends Thread
{
    public JoinThread(String s)
    {
        super(s);
    }

    public void run()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }

    public static void main(String[] args)
            throws InterruptedException
    {
        new JoinThread("第一号线程").start();
        for (int i=0;i<100;i++)
        {
            if(i==20)
            {
                JoinThread jt=new JoinThread("被join的线程");
                jt.start();
                jt.join();
            }
            System.out.println(Thread.currentThread().getName()+"***"+i);
        }

    }
}
