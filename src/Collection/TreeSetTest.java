package Collection;

import java.util.TreeSet;

public class TreeSetTest
{
    public static void main(String[] args)
    {
        TreeSet treeSet=new TreeSet();
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(4));
        System.out.println(treeSet.tailSet(5));
        System.out.println(treeSet.subSet(4,5));


    }
}
