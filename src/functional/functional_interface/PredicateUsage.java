package functional.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUsage {

    public static void main(String[] args) {

        //Predicate
        //used by .filter()
        Predicate<Integer> isEven = s -> s % 2 == 0;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(isEven).collect(Collectors.toList()));
        System.out.println(isEven.test(2));

        LongPredicate isNotEven = s -> s % 2 != 0;
        isNotEven.test(2);

        BiPredicate<Integer, Long> isGreater = (a, b) -> a > b;

    }
}
