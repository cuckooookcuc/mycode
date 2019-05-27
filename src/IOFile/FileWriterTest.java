package IOFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest
{
    public static void main(String[] args)
    {
        try(FileWriter fileWriter=new FileWriter("third.txt"))
        {
            fileWriter.write("第一行\r\n");
            fileWriter.write("第二行\r\n");
            fileWriter.write("第三行\r\n");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
