package ThreadTest;

public class InvokeRun extends Thread
{
    private int i;
    public void run(){
        for (;i<100;i++) {
            System.out.println(this.getName()+"===="+i);
        }
    }

    public static void main(String[] args)
    throws InterruptedException{
        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+"****"+i);
            if (i==20)
            {
                InvokeRun ir=new InvokeRun();
                ir.sleep(1);
                ir.start();
            }
        }
    }
}
