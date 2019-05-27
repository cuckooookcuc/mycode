package Practice;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSet190315
{
    public static void main(String[] args )
    {
        TreeSet c=new TreeSet();
        Collection d=new TreeSet();
        c.add(4);
        c.add(5);
        c.add(1);
        c.add(0);

        System.out.println(c.contains(5));
        System.out.println(c.getClass());
        System.out.println(d.getClass());
        System.out.println(((TreeSet) d).floor(2));
        System.out.println(((TreeSet) d).first());
        System.out.println(c.contains(5));

    }
}
