package performance;

public class TestEditor {
    public static void main(String[] args)
    {
        String s="[1,2,3,4,5]";
        for (int i :
                changeStringtoInt(s) ) {
            System.out.println(i);
        }

    }
    public static int[] changeStringtoInt(String str)
    {

        String[] split=str.substring(1,str.length()-1).split(",");
        int[] ints=new int[split.length];
        for (int i=0;i<ints.length;i++)
        {
            ints[i]=Integer.parseInt(split[i]);
        }
        return ints;
    }
}
