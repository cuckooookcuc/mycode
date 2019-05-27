package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest
{
    public static void main(String[] args)
    {
        Map map=new HashMap();
        Map map2=new HashMap();
        map.put(map2.entrySet(),1);
        map.put("yi",1);
        map.put("er",2);
        map.put("san",3);
        map.put("si",4);
        System.out.println(map.put("er",3));
        System.out.println(map);
        System.out.println(map.containsKey("yi"));
        System.out.println(map.containsValue(2));
        for(Object key:map.keySet())
        {
            System.out.println(key+"----"+map.get(key));
        }
        map.remove("er");
        System.out.println(map);
    }
}
