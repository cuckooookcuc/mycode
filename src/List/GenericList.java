package List;

import java.util.ArrayList;

public class GenericList
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("s");
        arrayList.add("3");
        arrayList.add("34");
        for (String str :
                arrayList)
        {
            System.out.println(str.length());

        }

    }
}
