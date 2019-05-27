package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest
{
    public static void main(String[] args)
            throws Exception
    {
        Properties properties=new Properties();
        properties.setProperty("username","syj");
        properties.setProperty("passworld","32333");
        properties.store(new FileOutputStream("a.ini"),"comments line");
        Properties properties1=new Properties();
        properties1.setProperty("gender","male");
        properties1.load(new FileInputStream("a.ini"));
        System.out.println(properties1);
    }
}
