package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class LearnStream {
    public static void main(String[] args) {
        Stream<Integer> oddNumberUnder10 = Stream.iterate(3, n -> n < 10, n -> n + 2);
        oddNumberUnder10.forEach(System.out::println);

        var myList = Stream.of("ssd", "ddd");
        long count = myList.count();
        System.out.println("count" + count);

        var myStream2 = Stream.of("a32", "sddfsfewfe", "dsfsdf");

        myStream2.min(Comparator.comparingInt(String::length)).ifPresent(m -> System.out.println("smallest: " + m));
    }
}
