package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest
{
    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
        Collections.replaceAll(arrayList,1,0);
        System.out.println(arrayList);
        System.out.println(Collections.frequency(arrayList,0));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList,3));
    }
}
