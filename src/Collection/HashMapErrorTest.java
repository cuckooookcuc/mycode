package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest
{
    public static void main(String[] args)
    {
        HashMap hashMap=new HashMap();
        hashMap.put(new Q(100),"100");
        hashMap.put(new Q(200),"200");
        System.out.println(hashMap);
        Iterator iterator=hashMap.keySet().iterator();
        Q q=(Q)iterator.next();
        q.count=20;
        System.out.println(hashMap);
        hashMap.remove(new Q(100));
        System.out.println(hashMap.get(new Q(100)));
        System.out.println(hashMap.get(new Q(20)));
    }
}
