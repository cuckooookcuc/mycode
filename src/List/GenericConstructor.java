package List;

class FOO
{
    public<T> FOO(T t)
    {
        System.out.println(t);
    }
}
class AOO
{
    public AOO(String s)
    {
        System.out.println(s);
    }
}
public class GenericConstructor
{
    public static void main(String[] args)
    {
        new FOO("dd");
        new FOO(23);
        new<String>FOO("dsd");
        new<Integer>FOO(9);
//        new <Integer>AOO("dd");
    }
}
