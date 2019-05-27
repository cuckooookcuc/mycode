package Practice;

import java.io.FileInputStream;

public class FileInputStream190313
{
    public static void main(String[] args)
    {   int hasRead=0;
        byte[] buff=new byte[32];
        try(FileInputStream fis=new FileInputStream("Twice.txt")){

            while ((hasRead=fis.read(buff))>0){
                System.out.println(new String(buff,0,hasRead));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
