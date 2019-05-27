package Practice;

import java.util.TreeMap;

class P implements Comparable
{
    int count;
    public P(int count)
    {
        this.count=count;
    }
    public String toString()
    {
        return "P:"+count;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
        {
            return true;
        }
        if (obj!=null&&obj.getClass()==P.class)
        {
            P p=(P)obj;
            return count==p.count;
        }
        return false;
    }

    public int compareTo(Object object)
    {
        P p=(P)object;
        return count>p.count?-1:
                count<p.count ?1:0;
    }
}
public class TreeMapTest
{
    public static void main(String[] args)
    {
        TreeMap treeMap=new TreeMap();
        treeMap.put(new P(3),"3");
        treeMap.put(new P(1),"2");
        treeMap.put(new P(2),"3");
        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.higherKey(new P(2)));
        System.out.println(treeMap.lowerKey(new P(2)));
        System.out.println(treeMap.subMap(new P(2),new P(-1)));

    }

}
