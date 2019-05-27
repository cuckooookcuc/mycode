package Collection;

import java.util.TreeSet;

class Z implements Comparable
{
    int age;
    public Z(int age)
    {
        this.age=age;
    }
    public boolean equals(Object object)
    {
        return true;
    }
    public int compareTo(Object object)
    {
        return 1;
    }
}

public class TreeSetTest2
{
    public static void main (String[] args)
    {
        TreeSet treeSet=new TreeSet();
        Z z1=new Z(9);
        treeSet.add(z1);
        System.out.println(treeSet.add(z1));
        System.out.println(treeSet);
        ((Z)treeSet.first()).age=10;
        System.out.println(((Z)treeSet.last()).age);
    }
}
