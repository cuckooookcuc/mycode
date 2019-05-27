package Collection;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest
{
    public static void main (String[] args)
    {
        Collection collection=new HashSet();
        collection.add("asdfgh");
        collection.add("asdfg");
        collection.add("asdf");
        collection.add("asd");
        collection.add("as");
        collection.removeIf(ele->((String)ele).length()<3);
        System.out.println(collection);
    }


}
