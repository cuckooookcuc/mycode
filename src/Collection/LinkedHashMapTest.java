package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest
{
    public static void main(String [] args)
    {
        LinkedHashMap score=new LinkedHashMap();
        score.put("math",80);
        score.put("English",60);
        score.put("Science",70);
        score.forEach((key,value)->System.out.println(key+"->"+value));

    }
}
