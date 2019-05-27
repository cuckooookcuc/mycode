package Div;

public class DivTest
{
    public static void main(String[] args)
    {
        try
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println(c);
        }
        catch (IndexOutOfBoundsException ie)
        {
            System.out.println("数组越界");
        }
        catch (NumberFormatException ne)
        {
            System.out.println("数组格式错误");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("算术异常");
        }
        catch (Exception e)
        {
            System.out.println("未知异常");
        }
    }
}
