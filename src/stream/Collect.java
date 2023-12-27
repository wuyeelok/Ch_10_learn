package stream;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {
        var myList = List.of("lions", "pigs", "bears", "tigers", "ox");
        Map<Integer, String> myMap = myList.stream().collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + ", " + s2, TreeMap::new));
        System.out.println(myMap);
    }

}
