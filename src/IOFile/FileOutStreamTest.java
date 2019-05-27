package IOFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest
{
    public static void main(String [] args)
    {
        try(FileInputStream fileInputStream=new FileInputStream(
                System.getProperty("user.dir")+
                        "\\src\\IOFile\\FileInputStreamTest.java");
            FileOutputStream outputStream=new FileOutputStream(System.getProperty("user.dir")
                    + "\\Twice.txt")
            )
        {
            int hasRead=0;
            byte[] buff=new byte[1024];
            while ((hasRead=fileInputStream.read(buff))>0)
            {
                outputStream.write(buff,0,hasRead);
            }
            System.out.println(outputStream);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
