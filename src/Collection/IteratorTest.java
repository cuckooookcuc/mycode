package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest
{
    public static void main (String[] args)
    {
        Collection collection=new ArrayList();
        collection.add("3");
        collection.add("2");
        collection.add("5");
        collection.add("4");
        Iterator iterator=collection.iterator();
        String first=(String)iterator.next();
        collection.remove("3");
//        while(iterator.hasNext())
//        {
//            String book=(String)iterator.next();
//            System.out.println(book);
//            if (book.equals("2"))
//            {
////                iterator.remove();
////                collection.remove(book);
//            }
//        }
        System.out.println(collection);
//        Collection collection=new ArrayList();
//        collection.add("9");
//        collection.add("5");
//        collection.add("4");
//        collection.add("3");
//        Iterator iterator=collection.iterator();
//        while(iterator.hasNext()){
//            String book=(String)iterator.next();
//            System.out.println(book);
//            if(book.equals("5"))
//            {
//                iterator.remove();
//            }
//            book="测试字符串";
//        }
//        System.out.println(collection);
    }
}
