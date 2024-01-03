package ques.eleven;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iter {
    public static void main(String[] args) {
        var ggg = Stream.iterate(1, x -> ++x)
                .limit(5).map(x -> "" + x)
                .collect(Collectors.joining());

        System.out.println(ggg);
    }
}
