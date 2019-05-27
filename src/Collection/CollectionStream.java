package Collection;

import java.util.stream.IntStream;

public class CollectionStream
{
    public static void main(String[] args)
    {
        IntStream is= IntStream.builder()
                .add(12)
                .add(23)
                .add(1)
                .build();


//        System.out.println(is.max().getAsInt());
//        System.out.println(is.min().getAsInt());
//        System.out.println(is.sum());
//        System.out.println(is.average());
        System.out.println(is.count());

    }
}
