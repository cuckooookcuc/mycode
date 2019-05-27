package Practice;

import java.io.File;

public class FileTest0313
{
    public static void main(String[] args){
        File file =new File("pathname");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
    }


}
