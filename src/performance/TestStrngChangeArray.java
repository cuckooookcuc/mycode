package performance;

import java.util.ArrayList;
import java.util.List;

public class TestStrngChangeArray
{
    public static void main(String[] args){
        String str = "0,1,2,3,4,5";
        String[] arr = str.split(","); // 用,分割
        List<Integer> arrayList=new ArrayList();
        for (String s :
                arr) {
            arrayList.add(Integer.parseInt(s));
            System.out.println(s);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(3)+arrayList.get(1));

    }
}
