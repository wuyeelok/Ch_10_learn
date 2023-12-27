package stream;

import utilities.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

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
