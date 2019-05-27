package ThreadTest;

public class DrawTest
{
    public static void main(String[] args)
    {
        Account account=new Account("190314",1000);
        DrawThread drawThread=new DrawThread("小章",account,600);
        DrawThread drawThread1=new DrawThread("小红",account,600);
        drawThread.start();
        drawThread1.start();

    }
}
