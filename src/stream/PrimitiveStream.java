package stream;

import utilities.CollectionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;


public class PrimitiveStream {

    public static void main(String[] args) {
        // Normal list
        List<Integer> myList = List.of(3, 6, 1, 45, 7, 9, 10);
        System.out.println(findAvg(myList));

        // Empty list
        List<Integer> myList2 = new ArrayList<>();
        System.out.println(findAvg(myList2));

        // Null list
        System.out.println(findAvg(null));

        var ran = DoubleStream.generate(Math::random);
        ran.limit(6).forEach(System.out::println);

        System.out.println("_____________________________");

        Random random = new Random();
        var oneDiceValStream = random.ints(8).map(i -> Math.abs(i % 6) + 1);
        oneDiceValStream.forEach(v -> System.out.println("Dice value: " + v));
    }

    private static double findAvg(List<Integer> myList) {

        if (CollectionUtil.isNotNullOrEmpty(myList)) {
            return myList.stream()
                    .mapToInt(i -> i)
                    .average()
                    .orElse(0);
        } else {
            return 0;
        }
    }
}
