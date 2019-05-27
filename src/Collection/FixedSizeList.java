package Collection;


import java.util.Arrays;
import java.util.List;

public class FixedSizeList
{
    public static void main(String[] args)
    {
        List fixedSizeList= Arrays.asList("dsfddg","dfsfg","dsfsf");
        System.out.println(fixedSizeList.getClass());
        fixedSizeList.forEach(ele->System.out.println(ele));

    }


}
