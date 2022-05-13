package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {

    public static void main(String[] args) {
        List<String> numbersAsStrings = Arrays.asList("1", "2", "3", "10", "100");

        List<Integer> numbersAsInts = numbersAsStrings.stream()
                .map(s -> Integer.valueOf(s))
                .filter(n -> n % 2 ==1)
                .collect(Collectors.toList());
        System.out.println(numbersAsInts);

    }
}
