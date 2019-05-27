package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2
{
    public static void main(String[] args)
    {
        Collection collection=new HashSet();
        collection.add("asdfgh");
        collection.add("asdfg");
        collection.add("asdf");
        collection.add("asd");
        collection.add("as");
        System.out.println(calAll(collection,ele->((String)ele).contains("as")));
        System.out.println(calAll(collection,ele->((String)ele).contains("sd")));
        System.out.println(calAll(collection,ele->((String)ele).length()>1));
    }

    public static int calAll(Collection books, Predicate p)
    {
        int total =0;
        for(Object obj:books)
        {
            if (p.test(obj))
            {
                total++;
            }
        }
        return total;
    }
}
