package ques.eighteen;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;

public class Teeing {
    public static void main(String[] args) {
        List<Integer> iList = List.of(5, 1, 8, 2, 9, 2, 1);
        CountSum cs = iList.stream()
                .collect(Collectors.teeing(counting(), summingInt(e -> e), CountSum::new));
        System.out.println(cs);
    }
}


