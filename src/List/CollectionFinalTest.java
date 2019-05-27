package List;

import java.util.*;

public class CollectionFinalTest
{
    public static void main(String[] args)
    {
        List<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        List<String> integerList=new ArrayList<>();
        integerList.add("1");
        integerList.add("2");
        integerList.add("3");
        Map<String,List<String>> map=new HashMap<>();
        map.put("one",stringList);
        map.put("two",stringList);
        map.put("three",integerList);
        //利用键值
        for (Map.Entry<String,List<String>> e:map.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        //利用key
        Iterator iterator=map.keySet().iterator();
        while(iterator.hasNext())
        {
            String s=(String)iterator.next();
            System.out.println(s+"::"+map.get(s));
        }
        //只输出value
        for (List<String> s :
                map.values()) {
            System.out.println(s);
        }
    }


}
