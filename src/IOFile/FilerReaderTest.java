package IOFile;
import java.io.FileReader;
import java.io.IOException;

public class FilerReaderTest
{
    public static void main(String[] args)

    {
        try (FileReader fileInputStream=new FileReader(
                System.getProperty("user.dir")
                        +"\\src\\IOFile\\FilerReaderTest.java")
            )
            {
                char[] chars=new char[32];
                int hasRead=0;
                while ((hasRead=fileInputStream.read(chars))>0)
                {
                    System.out.println(new String(chars,0,hasRead));
                }
            }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
