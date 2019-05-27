package IOFile;

public class PrintCommand implements Command
{
    @Override
    public  void Process(int[] target)
    {
        for (int num :
                target)
        {
            System.out.println(num);
        }
    }


}
