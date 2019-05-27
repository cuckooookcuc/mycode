package IOFile;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamTest
{
//    public static void main(String[] args)
//            throws IOException
//    {
//        FileInputStream fileInputStream=new FileInputStream("FIS.java");
//        byte[] bbuf=new byte[1024];
//        int hasRead=0;
//        while ((hasRead=fileInputStream.read(bbuf))>0)
//        {
//            System.out.println(new String(bbuf,0,hasRead));
//        }
//        fileInputStream.close();
//    }
    public static void main(String[] args)
    throws IOException
    {
//        FileInputStream fileInputStream=new FileInputStream(
//                "D:\\lastdream\\java\\mycode\\src\\IOFile\\FileInputStreamTest.java");
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\IOFile\\FileInputStreamTest.java");
        byte[] bytes=new byte[24];
        int hasRead=0;
        //此段用于测试中文字符是否会出现乱码
        while ((hasRead=fileInputStream.read(bytes))>0)
        {
            System.out.println(hasRead);
            System.out.println(new String(bytes,0,hasRead));
        }
        fileInputStream.close();

    }
}
