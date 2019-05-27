package Collection;

import java.io.InputStream;
import java.util.stream.IntStream;

public class IntStreamTest
{
    public static void main(String[] args)
    {
        IntStream is = IntStream.builder()
                .add(21)
                .add(32)
                .add(54)
                .add(22)
                .build();
        System.out.println(is.max().getAsInt());
//        System.out.println(is.min().getAsInt());
//        is.forEach(System.out::println);
//        System.out.println(is.sum());
//        System.out.println(is.count());
//        System.out.println(is.average());
//        System.out.println(is.allMatch(ele->ele*ele>20));
//        System.out.println(is.anyMatch(ele->ele*ele>20));
//        IntStream newIs=is.map(ele->ele*2+1);
//        newIs.forEach(System.out::println);
    }
}
