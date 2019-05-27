package List;

import java.util.ArrayList;

public class ListErr
{
    public static void main(String[] args)
    {
        ArrayList arrayList=new ArrayList();
        arrayList.add("sd");
        arrayList.add("sdd");
        arrayList.add(20);
        for (Object obj : arrayList)
        {
            System.out.println(((String)obj).length());
        }
    }
}
