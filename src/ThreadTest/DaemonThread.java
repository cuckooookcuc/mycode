package ThreadTest;

public class DaemonThread extends Thread
{
    public void run()
    {
        for (int i=0;i<1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }

    public static void main(String[] args)
    {
        DaemonThread dt=new DaemonThread();
        dt.setDaemon(true);
        dt.start();
        System.out.println(dt.isDaemon());
        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"***"+i);
        }
    }
}
