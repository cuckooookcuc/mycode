package IOFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest
{
    public static void main(String[] args)
    {
        try(
                FileOutputStream fos=new FileOutputStream("test.txt");
                PrintStream ps=new PrintStream(fos)
                )
        {
            ps.println("普通字符串");
            ps.println(new PrintStreamTest());
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
