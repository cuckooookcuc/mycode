package Practice;

import java.util.HashMap;
import java.util.Map;

public class MapTest2
{
    public static void main(String[] args)
    {
        Map map=new HashMap();
        map.put("yi",1);
        map.put("er",2);
        map.put("san",3);
        map.containsKey("yi");
        map.containsValue(3);
        for (Object mapEntry :
                map.entrySet()) {
            System.out.println(mapEntry);
        }
        for (Object e :
                map.entrySet()) {
            Map.Entry me=(Map.Entry)e;
            System.out.println(me.getKey()+"====="+me.getValue());
        }
    }

}
