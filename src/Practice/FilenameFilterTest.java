package Practice;

import java.io.File;
import java.util.Objects;

public class FilenameFilterTest
{
    public static void main(String[] args)
    {
        File file=new File(".");
        String [] nameList=file.list();
    }
}
