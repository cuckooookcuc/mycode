package Collection;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2
{
    public static void main(String[] args)
    {
        Collection collection=new HashSet();
        collection.clear();
        collection.add(Season.SPRING);
        collection.add(Season.SUMMER);
        EnumSet enumSet=EnumSet.copyOf(collection);
        System.out.println(collection);
        System.out.println(enumSet);
    }
}
