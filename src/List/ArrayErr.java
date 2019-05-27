package List;

public class ArrayErr
{
    public static void main(String [] args)
    {
        Integer[] integers=new Integer[5];
        Number[] a=integers;
        a[0]=0.5;
    }
}
