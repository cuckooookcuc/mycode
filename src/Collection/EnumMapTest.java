package Collection;

import java.util.EnumMap;

enum Season2
{
    SPRING,SUMMER,FALL,WINTER
}
public class EnumMapTest
{
    public static void main(String[] args)
    {
        EnumMap enumMap=new EnumMap(Season2.class);
        enumMap.put(Season2.SPRING,"1");
        enumMap.put(Season2.SUMMER,"2");
        System.out.println(enumMap);
    }
}
