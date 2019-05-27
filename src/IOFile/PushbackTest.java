package IOFile;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackTest
{
    public static void main(String[] args)
    {
        try
                (
                    PushbackReader pis=new PushbackReader
                        (
                        new FileReader(System.getProperty("user.dir")
                        +"\\src\\IOFile\\PushbackTest.java"),64
                        )
                )
        {
            char[] buff=new char[32];
            String lastContent="";
            int hasRead=0;
            while ((hasRead=pis.read(buff))>0)
            {
                String content=new String(buff,0,hasRead);
                int target=0;
                if((target=(content+lastContent).indexOf("new PushbackReader"))>0)
                {
                    pis.unread((lastContent+content).toCharArray());
                    if (target>32)
                    {
                        buff=new char[32];
                    }
                    pis.read(buff,0,target);
                    System.out.println(new String(buff,0,target));
                    System.exit(0);
                }
                else
                {
                    System.out.println(content);
                    lastContent=content;
                }
            }

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
