package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest2
{
    public static void main(String[] args)
    {
        Map map=new HashMap();
        map.put("yi",1);
        map.put("er",2);
        map.put("san",null);
        map.put("si",4);
        System.out.println(map);
        map.replace("wu",5);
        System.out.println(map);
        map.merge("si",4,(key,value)->(Integer)key+(Integer)value);
        System.out.println(map);
        map.computeIfAbsent("san",key->((String)key).length());
        System.out.println(map);
        map.computeIfPresent("er",(key,value)->(Integer)value*(Integer)value);
        System.out.println(map);
    }
}
