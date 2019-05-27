package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public  static void main (String[] args){
        Collection collection=new ArrayList();
        collection.add("第一个值");
//        System.out.println(collection.size());
        collection.add(6);
//        collection.remove("第一个值");
//        System.out.println(collection.size());
//        collection.remove(6);
//        System.out.println(collection.size());
//        System.out.println(collection.contains(0));
//         System.out.println(collection.toString());
        Collection collection1=new HashSet();
        collection1.add(6);
        collection1.add("five");
//        System.out.println(collection.containsAll(collection1));
//        collection.removeAll(collection1);
//        System.out.println(collection);
//        collection.clear();
//        System.out.println(collection);
        collection.retainAll(collection1);
    }
}
