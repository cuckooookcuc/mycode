package Collection;

import java.util.HashSet;

class A
{
    public boolean equals(Object object)
    {
        return true;
    }
}
class B
{
    public int hashCode()
    {
        return 1;
    }
}

class C
{
    public boolean equals(Object o)
    {
        return true;
    }

    public int hashCode()
    {
        return 1;
    }
}


public class HashSetTest
{
    public static void main(String[] args){
        HashSet books=new HashSet();
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
