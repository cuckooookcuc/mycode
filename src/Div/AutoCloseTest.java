package Div;

import java.io.*;

public class AutoCloseTest
{
    public static void main(String[] args)
            throws IOException
    {
        try(
                BufferedReader buff=new BufferedReader(
                        new FileReader("D:j.jsva"));
                PrintStream ps=new PrintStream(new FileOutputStream("a.txt"))
        )
        {
            System.out.println(buff.readLine());
            ps.println();
        }
    }
}
