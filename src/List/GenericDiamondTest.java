package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MyClass<E>
{
    public<T> MyClass(T t)
    {
        System.out.println(t);
    }
}
public class GenericDiamondTest
{
    public static void main(String [] args)
    {
        MyClass<String> myClass=new MyClass(5);
        MyClass<String>myClass1=new <String>MyClass<String>("d");
        List<Number> ln=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        Integer integer=Copy(ln,in);

    }
    public static <T> T Copy(Collection<? super T> dest,Collection<T> scr)
    {
        T last=null;
        for (T t :
                scr) {
            last=t;
            dest.add(t);
        }
        return last;
    }
//    public static <T,S extends T> S Copy(Collection<T> dest,Collection<S> scr)
//    {
//        S last=null;
//        //Collection<Number> dest,Collection<Int> scr
//        for (S s: scr
//             )
//        {
//             last=s;
//            dest.add(s);
//
//        }
//        return last;
//    }
}
