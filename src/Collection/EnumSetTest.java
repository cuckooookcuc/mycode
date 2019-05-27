package Collection;

import java.util.EnumSet;

enum Season
{
    SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest
{
    public static void main(String[] args)
    {
        EnumSet enumSet=EnumSet.allOf(Season.class);
        System.out.println(enumSet);
        EnumSet enumSet1=EnumSet.noneOf(Season.class);
        System.out.println(enumSet1);
        enumSet1.add(Season.FALL);
        enumSet1.add(Season.SPRING);
        System.out.println(enumSet1);
        EnumSet enumSet2=EnumSet.of(Season.SPRING,Season.FALL);
        System.out.println(enumSet2);
        EnumSet enumSet3=EnumSet.range(Season.SPRING,Season.WINTER);
        System.out.println(enumSet3);
        EnumSet enumSet4=EnumSet.complementOf(enumSet2);
        System.out.println(enumSet4);
    }

}
