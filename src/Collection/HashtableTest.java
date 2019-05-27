package Collection;

import java.util.HashSet;
import java.util.Hashtable;

class Q
{
    int count;
    public Q(int count)
    {
        this.count=count;
    }
    public boolean equals(Object o)
    {
        if (o==this)
        {
            return true;
        }
        if(o!=null&&o.getClass()==Q.class)
        {
            Q q=(Q)o;
            return count==q.count;
        }
        return  false;
    }

    @Override
    public int hashCode()
    {
        return count;
    }
}
class W
{
    public boolean equals(Object o)
    {
        return true;
    }
}
public class HashtableTest
{
    public static void main(String[] args)
    {
        Hashtable hashtable=new Hashtable();
        hashtable.put(new Q(1),"1");
        hashtable.put(new Q(2),"2");
        hashtable.put(new Q(3),new W());
        System.out.println(hashtable);
        System.out.println(hashtable.containsValue("s"));
        System.out.println(hashtable.containsKey(new Q(1)));
        hashtable.remove(new Q(3));
        System.out.println(hashtable);


    }
}
