package List;

import java.util.*;

public class DiamondTest
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("13");
        list.add("err");
        list.add("df");
//        for (String str :
//                list) {
//            System.out.println(str);
//        }
        Map<String,List<String>> map=new HashMap<>();
        List<String> list1=new ArrayList<>();
        list1.add("dd");
        list1.add("dsd");
        map.put("dsd",list);
        map.put("dsdf",list1);
        map.put("ddf",list);
        System.out.println(map);
//        for (Map.Entry<String, List<String>> stringListEntry:
//                map.entrySet()
//        ){
//            System.out.println(stringListEntry);
//    }
//        for (List<String> s:map.values())
//        {
//            System.out.println(s);
//        }
//        for (String s:map.keySet())
//        {
//            System.out.println(s+":"+map.get(s));
//
//        }
        System.out.println(map.getOrDefault("ffff",list1));

//        System.out.println(map.size());
//        System.out.println(map.get("dsd"));
        
//        Set<String> set=map.keySet();
//        Iterator<String> iterator=set.iterator();
//        while (iterator.hasNext())
//        {
//            String str=iterator.next();
//            System.out.println(str+map.get(str));
//        }
        
    }
}
