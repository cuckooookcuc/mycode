package ThreadTest;

public class StartDead extends Thread
{
    private int i;
    public void run()
    {
        System.out.println(i);
        for (;i<100;i++)
        {
            System.out.println(getName()+"="+i);
        }
    }
    public static void main(String[] args)
    {
        StartDead sd=new StartDead();
        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"****"+i);
            if (i==20)
            {
                sd.run();
                System.out.println(sd.isAlive());
            }
            if (i>20&&!sd.isAlive())
            {
            sd.start();
            }
        }
    }
}
