package IOFile;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterTest
{
    public static void main(String [] args)
    {
        File file=new File(".");
        String[] strings=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("va");
//                return name.endsWith(".java")||new File(name).isDirectory();
//                return true;
            }
        });
        File file1=new File("11.txt");
        System.out.println(file1.delete());

        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}
