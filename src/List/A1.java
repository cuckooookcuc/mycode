package List;

import java.util.ArrayList;
import java.util.List;

public class A1 extends Apple
{
    public String getInfo()
    {
        return "子类"+super.getInfo();
    }
    public static void main(String[] args)
    {
        List<String> stringList=new ArrayList<>();
        stringList.add("dsf");
        stringList.add("df;");
        stringList.add("df");
        test(stringList);
        List<?> c=new ArrayList<String>();

    }

     private static void test(List<?> c)
    {
        for (int i=0;i<c.size();i++)
        {
            System.out.println(c.get(i));
        }
    }
}
