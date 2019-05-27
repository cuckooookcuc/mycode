package Collection;

import java.util.ArrayList;
import java.util.List;

class D
{
    public boolean equals(Object object)
    {
        return true;
    }
}
public class ListText2
{
    public static void main(String[] args)
    {
        List list=new ArrayList();
        list.add("asdfgghjkl");
        list.add("sdfslfkjg");
        list.add("sdffdsag");
        System.out.println(list);
        list.remove(new D());
        System.out.println(list);
    }
}
