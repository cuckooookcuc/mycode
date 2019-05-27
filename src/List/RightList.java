package List;

import java.util.ArrayList;
import java.util.Collection;

public class RightList
{
    static <T,S extends T> void FromTo(Collection<S> f,Collection<T> t)
    {
        t.addAll(f);
//        for (T to :f)
//        {
//            t.add(to);
//        }

    }
    public static void main(String[] args)
    {
        Collection<String> stringCollection=new ArrayList<>();
        Collection<Object> objectCollection=new ArrayList<>();
        stringCollection.add("yi");
        stringCollection.add("er");
        objectCollection.add(3);
        objectCollection.add(4);
        FromTo(stringCollection,objectCollection);
        System.out.println(stringCollection);
    }
}
