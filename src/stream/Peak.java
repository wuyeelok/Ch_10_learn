package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Peak {

    public static void main(String[] args) {
        var stream = Stream.of("asdf", "black", "red", "redmine", "exvd", "rough");

        var dd = stream.filter(s -> s.startsWith("r")).peek(System.out::println).toList();

        System.out.println("sd" + dd + "\n");

        // With stream
        var list = List.of("Toby", "Aa", "LL", "Alex");
        list.stream()
                .filter(s -> s.length() == 4)
                .sorted().limit(1)
                .forEach(System.out::println);

        // Without stream
        var listB = new ArrayList<String>();
        for (String s : list) {
            if (s.length() == 4) {
                listB.add(s);
            }
        }
        Collections.sort(listB);
        if (!listB.isEmpty() && listB.get(0) != null) {
            System.out.println(listB.get(0));
        }


    }
}
