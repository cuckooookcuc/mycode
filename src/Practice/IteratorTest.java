package Practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest
{
    public static void main(String[] args)
    {
        Collection c=new HashSet();
        c.add("yi");
        c.add("er");
        c.add("san");
        System.out.println(c);
        Iterator it=c.iterator();
        while (it.hasNext())
        {
//            String=it.next();
            if (it.next().equals("er"))
            {
                it.remove();
            }
        }
        System.out.println(c);
    }
}
