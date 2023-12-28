package stream;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {
        var myList = List.of("lions", "pigs", "bears", "tigers", "ox");
        Map<Integer, String> myMap = myList.stream().collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2));
        System.out.println(myMap);

        Map<Integer, String> aMap = myList.stream().collect(Collectors.toMap(String::length, Function.identity(), (a, b) -> a + ", " + b, TreeMap::new));
        System.out.println(aMap);

        // group by
        var kkk = myList.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(kkk);


    }

}
