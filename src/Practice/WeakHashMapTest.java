package Practice;

import java.util.WeakHashMap;

public class WeakHashMapTest
{
    public static void main(String[] args)
    {
        WeakHashMap weakHashMap=new WeakHashMap();
        weakHashMap.put(new String("1"),"yi");
        weakHashMap.put(new String("2"),"er");
        weakHashMap.put("3","san");
        weakHashMap.put("java","e");
        System.out.println(weakHashMap);
        System.gc();
        System.runFinalization();
        System.out.println(weakHashMap);
    }
}
