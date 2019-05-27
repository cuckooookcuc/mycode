package List;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet=new TreeSet<>(
                new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return hashCode()>o2.hashCode()?1:
                        hashCode()<o2.hashCode()?-1:0;
            }
        });
        treeSet.add("1");
        treeSet.add("2");
        TreeSet<String> treeSet1=new TreeSet<>(
                new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.hashCode()>o2.hashCode()?1:
                        o1.hashCode()<o2.hashCode()?-1:0;
            }
        });
        treeSet1.add("3");
        treeSet1.add("4");
        System.out.println(treeSet);
        System.out.println(treeSet1);
    }

}
