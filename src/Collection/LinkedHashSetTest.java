package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest
{
    public static void main(String[] args)
    {
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        System.out.println(linkedHashSet);

        linkedHashSet.remove("1");
        linkedHashSet.add("1");
        System.out.println(linkedHashSet);


    }


}
