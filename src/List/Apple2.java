package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Apple2<T extends Number>
{
    Apple2<Number> f=new Apple2<>();
    Apple2<Integer> integerApple2=new Apple2<>();
    Apple2<Double> doubleApple2=new Apple2<>();

    public static void main(String[] args)
    {
//        String[] strings={"dfdsff","dfsdfs"};
//        Collection<String> collection=new ArrayList();
//        FromArrayToCollection(strings,collection);
//        System.out.println(collection);
        Integer[] integers={1,2};
        Double[] doubles={2.3,2.5};
        Float[] floats={3.2f,3.3f};
        Number[] numbers={3.2,2};
        Collection<Number> numberCollection=new ArrayList<>();
        FromArrayToCollection(numbers,numberCollection);
        FromArrayToCollection(floats,numberCollection);

    }

    static<T> void FromArrayToCollection(T[] objects,
                                      Collection<T> objectCollection)
    {
        for (T obj :
                objects) {
            objectCollection.add(obj);
        }
    }
}


