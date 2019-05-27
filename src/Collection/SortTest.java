package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTest
{
    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);


    }
}
