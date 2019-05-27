package Collection;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest2
{
    public static void main(String[] args)
    {
        TreeSet treeSet=new TreeSet();
        treeSet.add(new String("d"));
        treeSet.add(new Date());
    }
}
