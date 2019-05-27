package Collection;

import java.util.*;

public class UnmodifiableTest
{
    public static void main(String[] args)
    {
        List unmodifiablelist= Collections.emptyList();
        Set unmodifiableSet=Collections.singleton("w");
        Map map =new HashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        Map unmodifiableMap=Collections.unmodifiableMap(map);


    }
}
