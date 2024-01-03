package ques.six;

import java.util.stream.Stream;

public class Match {

    public static void main(String[] args) {
        var s = Stream.generate(() -> "mew");
        var match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }

}
