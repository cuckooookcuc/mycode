package annotation;


public class FirstTest {
    @FirstAnnotionTest
    public int number1;
    @FirstAnnotionTest(name= "xiaohong",age = 22)
    public int number2;
    @FirstAnnotionTest(name = "xiaoming")
    public int number3;
    @FirstAnnotionTest(name = "xiaoming")
    public int number4;
    @Deprecated
    public String number5;

    public  int sum(){
        return  0;
    }
}
