package IOFile;

public class AddComamand implements Command
{
    @Override
    public void Process(int[] target)
    {
        int sum=0;
        for (int i=0;i<target.length;i++)
        {
            sum+=target[i];
        }
        System.out.println(sum);
    }
}
