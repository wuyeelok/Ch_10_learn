package ques.one;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var stream = Stream.iterate("", s -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
        //stream.limit(2).map(x -> x + "2").forEach(System.out::println);
    }
}
