package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class TryOpt {
    public static Optional<Double> average(int... scores) {


        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return Optional.of((double) (sum / scores.length));
    }


    public static void main(String[] args) {

        Consumer<Double> printVal = value -> System.out.println("Average Value is " + value);

        Optional<Double> opDouble = average(4, 5, 8);
        opDouble.ifPresent(printVal);

        System.out.println(opDouble.orElse(Double.NaN));
        System.out.println(opDouble.orElseGet(Math::random));

        Optional<Double> empty = average();
        empty.ifPresent(printVal);

        System.out.println(empty.orElse(Double.NaN));
        System.out.println(empty.orElseGet(Math::random));


    }
}
