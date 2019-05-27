package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Practice1
{
    public static void main(String[] args)
    {
        Collection c=new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        System.out.println(c.size());
        c.remove(6);
        System.out.println(c.contains(1));
        Collection c2=new HashSet();
        c.add("yi");
        c.add("er");
        c.add("san");
        System.out.println(c.containsAll(c));
        c.removeAll(c2);
        c.clear();
        c.retainAll(c2);
    }
}
