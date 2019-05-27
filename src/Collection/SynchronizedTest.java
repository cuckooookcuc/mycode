package Collection;

import java.util.*;

public class SynchronizedTest
{
    public static void main(String[] args)
    {
        Collection collection=Collections.synchronizedCollection(new ArrayList());
        List list=Collections.synchronizedList(new ArrayList());
        Set set=Collections.synchronizedSet(new HashSet());
        Map map=Collections.synchronizedMap(new HashMap());
    }
}
