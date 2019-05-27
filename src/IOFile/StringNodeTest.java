package IOFile;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest
{
    public static void main(String[] args)
    {
        String src="第一个\n" +
                "第二个\n" +
                "第三个\n";
        char[] buffer=new char[32];
        int hasRead=0;
        try(
                StringReader sr=new StringReader(src)
                )
        {
                while ((hasRead=sr.read(buffer))>0)
                {
                    System.out.println(new String(buffer,0,hasRead));
                }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        try(
                StringWriter sw=new StringWriter();
                )
        {
            sw.write("yi\n");
            sw.write("er\n");
            System.out.println(sw);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
