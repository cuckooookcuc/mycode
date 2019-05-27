package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForeachTest
{
    public  static void main(String[] args){
        Collection collection=new ArrayList();
        collection.add("3");
        collection.add("2");
        collection.add("6");
        collection.add("5");
        for (Object object :collection)
        {
            String book=(String)object;
            System.out.println("book");
            if(book.equals("3"))
            {
                collection.remove(book);
            }
        }
    }

}
