package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListTest2
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(1,4);
        for (Object i :
                list) {
            System.out.println(i);
        }
        list.remove(1);
        list.set(1,"d");
    }
}
