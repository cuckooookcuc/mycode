package List;
class Bpple<X extends Number>
{
    X size;
    public Bpple()
    {

    }
    public Bpple(X x)
    {
        setSize(x);
    }
    public void setSize(X x)
    {
        this.size=x;
    }
    public X getSize()
    {
        return size;
    }

}
public class ErasureTest
{
    public static void main(String[] args)
    {
        Bpple<Integer> a=new Bpple<>(9);
        Integer as=a.getSize();
        Bpple b=a;
        Number size1=b.getSize();
        //Integer size2=b.getSize();
        System.out.println(a.size);

    }
}
