package Collection;

import java.util.TreeSet;

class R2 implements Comparable
{
    int count;
    public R2(int count)
    {
        this.count=count;
    }

    @Override
    public String toString() {
        return "R[count:"+count+"]";
    }

    public boolean equals(Object object)
    {
        if (this==object)
            return true;
        if (object!=null&&object.getClass()==R.class)
        {
            R2 r=(R2)object;
            return r.count==this.count;
        }
        return false;
    }

    public int compareTo(Object object)
    {
        R2 r=(R2)object;
        return r.count>this.count  ? -1:
                r.count<this.count ? 1:0;
    }
}
public class TreeSetTest3
{
    public static void main(String[] args)
    {
        TreeSet treeSet=new TreeSet();
        treeSet.add(new R2(5));
        treeSet.add(new R2(-3));
        treeSet.add(new R2(9));
        treeSet.add(new R2(-2));
        System.out.println(treeSet);
        R2 r2=(R2)treeSet.first();
        r2.count=20;
        R2 last=(R2)treeSet.last();
        last.count=-2;
        System.out.println(treeSet);
        System.out.println(treeSet.remove(new R2(-2)));
        System.out.println(treeSet);
        System.out.println(treeSet.remove(new R2(5)));
        System.out.println(treeSet);
        System.out.println(treeSet.remove(new R2(-2)));
        System.out.println(treeSet);
    }


}
