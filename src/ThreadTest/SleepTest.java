package ThreadTest;

import java.util.Date;

public class SleepTest
{
    public static void main(String[] args)
            throws Exception
    {
        for (int i=0;i<10;i++)
        {
            System.out.println(new Date());
            Thread.sleep(2000);
        }
    }
}
