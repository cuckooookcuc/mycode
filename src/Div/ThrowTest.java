package Div;

public class ThrowTest
{
    public static void main(String [] args)throws Exception
    {
//        try
//        {
            throwChecked(-3);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
        throwRuntime(-3);
        System.out.println(-3);
    }
    public static void throwChecked(int a)throws Exception
    {
        if (a>0)
        {
            throw new Exception("a>0???");
        }
    }

    public static void throwRuntime(int a)
    {
        if (a>0)
        {
            throw new RuntimeException("a>0:::");
        }
    }
}
