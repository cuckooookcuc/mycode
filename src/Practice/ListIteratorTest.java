package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest
{
    public static void main(String[] args)
    {
        String[] book= {
                "sdfsdfas",
                "dfafdsf",
                "fsafda"
        };
        List list=new ArrayList();
        for (int i=0;i<book.length;i++)
        {
            list.add(book[i]);
        }
        ListIterator bookList=list.listIterator();
        while(bookList.hasNext())
        {
            System.out.println(bookList.next());
            bookList.add("--------");
        }
        System.out.println("**********");
        while (bookList.hasPrevious())
        {
            System.out.println(bookList.previous());
        }
    }
}
