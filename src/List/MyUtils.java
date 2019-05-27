package List;

import java.util.Collection;

public class MyUtils
{
    public static void main(String[] args)
    {

    }
//    public static <T> void copy(Collection<T> one,Collection<? extends T> two)
//    {
//        System.out.println("1");
//    }
    public static <T> T copy(Collection<? super T> one,Collection<T> two)
    {
        System.out.println("2");
        T t=null;
        return null;
    }
}
