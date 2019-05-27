package Collection;

import java.util.HashMap;
import java.util.Map;

public class NullInHashMap
{
    public static void main(String [] args)
    {
        Map map=new HashMap();
        map.put(null,null);
        map.put(null,1);
        System.out.println(map);
        map.put("a",1);
        System.out.println(map);
    }
}
