package Practice;

import java.io.*;

public class NewSample
{
    public static void main(String[] args)
    {
        //写入10行随机整数
        try (
                BufferedWriter bw=new BufferedWriter(
                        new FileWriter("A.txt"))
                )
        {
            for (int i=0;i<10;i++)
            {
                bw.write(String.valueOf((int) (Math.random()*10)));
                bw.newLine();
            }

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        //提取A文件10行整数，分别乘以2放入B
        try(
                BufferedReader fr2=new BufferedReader(
                                    new FileReader("A.txt")
                );
                BufferedWriter bw2=new BufferedWriter(
                                    new FileWriter("B.txt"))
                ){
                for (int i=0;i<10;i++){
                    int temp=Integer.parseInt(fr2.readLine())*2;
                    bw2.write(String.valueOf(temp));
                    bw2.newLine();
                }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
