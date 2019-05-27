package Collection;

import java.util.IdentityHashMap;

public class IdentityHashMapTest
{
    public static void main(String[] args)
    {
        IdentityHashMap identityHashMap=new IdentityHashMap();
        identityHashMap.put(new String("1"),"yi");
        identityHashMap.put(new String("2"),"er");
        identityHashMap.put("java",93);
        identityHashMap.put("java",33);
        System.out.println(identityHashMap);

    }
}
