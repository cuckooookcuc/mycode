package ThreadTest;

public class YieldTest extends Thread
{
    public YieldTest(String s)
    {
        super(s);
    }
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println(getName()+"***"+i);
            if (i==20)
            {
                Thread.yield();
            }
        }
    }
    public static void main(String[] args)
    {
        YieldTest yt1=new YieldTest("高级");yt1.start();
        yt1.setPriority(Thread.MAX_PRIORITY);

        YieldTest yt2=new YieldTest("低级");yt2.start();
        yt2.setPriority(Thread.MIN_PRIORITY);

    }
}
