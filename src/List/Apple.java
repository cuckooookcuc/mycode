package List;

public class Apple<T>
{
    private T info;
    public Apple(){}
    public Apple(T info)
    {
        this.info=info;
    }
    public void setInfo(T info)
    {
        this.info=info;
    }
    public T getInfo()
    {
        return info;
    }
    public static void main(String[] args)
    {
        Apple<String> s=new Apple<>("1");
        System.out.println(s.getInfo());
        Apple<Double> d=new Apple<>(0.01);
        System.out.println(d.getInfo());
    }
}
