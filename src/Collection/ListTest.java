package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add(new String("zxcvbnm"));
        list.add("zxcvbn");
        list.add("qwertyuiop");
//        System.out.println(list);
        list.add(1,"dasdfghjkl");
//        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf(new String("aaa")));
//        list.set(1,"ok");
//        System.out.println(list);
//        System.out.println(list.subList(0,2));
    }
}
