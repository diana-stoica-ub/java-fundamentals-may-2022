package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 4, 5, 3, 5, 6);

        Optional<Integer> findFirst = list.stream().filter(n -> n % 2 == 0).findFirst();
        Optional<Integer> findAny = list.stream().filter(n -> n % 2 == 0).findAny();

        Optional<Integer> optionalTwo = list.stream().filter(n -> n == 2).findAny();
        if (optionalTwo.isEmpty()) {
            System.out.println("2 was not found");
        } else {
            System.out.println(optionalTwo.get());
        }
    }
}
