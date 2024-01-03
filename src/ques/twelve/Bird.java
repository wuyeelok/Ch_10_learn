package ques.twelve;

import java.util.Set;
import java.util.stream.Stream;

public class Bird {

    public static void main(String[] ff) {
        Set<Integer> birdSetA = Set.of(4, 8);
        Set<String> birdSetB = Set.of("azzzzzzzz", "324sdf");

        Stream.concat(birdSetA.stream(), birdSetB.stream()).forEach(System.out::println);
    }

}
