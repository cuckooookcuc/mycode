package Div;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowTest2
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        try
        {
            new FileOutputStream("dd.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }
}
