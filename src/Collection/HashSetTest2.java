package Collection;

import java.util.HashSet;
import java.util.Iterator;

class R {
        int count;

        public R(int count) {
            this.count = count;
        }

        public String toString() {
            return "R[count:" + count + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj != null && obj.getClass() == R.class) {
                R r = (R) obj;
                return this.count == r.count;
            }
            return false;
        }

        public int hashCode() {
            return this.count;
        }
    }

    public class HashSetTest2
    {
        public static void main(String[] args)
        {
            HashSet hashSet=new HashSet();
            hashSet.add(new R(5));
            hashSet.add(new R(-3));
            hashSet.add(new R(9));
            hashSet.add(new R(-2));
//            System.out.println(hashSet);
            Iterator iterator=hashSet.iterator();
            R first=(R)iterator.next();
            first.count=3;
            System.out.println(hashSet);
            hashSet.remove(new R(-3));
            System.out.println(hashSet);
            System.out.println(hashSet.contains(new R(-3)));
            System.out.println(hashSet.contains(new R(-2)));


        }

    }

