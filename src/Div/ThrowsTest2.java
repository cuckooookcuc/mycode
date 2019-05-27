package Div;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest2
{
    public static void main(String[] args)throws IOException
    {
        try{
                test();
        }
        catch (Exception e)
        {
            System.out.println(1);
        }
    }
    public static void test()throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("dfs");
    }
}
