package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {

    public static void main(String[] args) {

        //filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> strings = Arrays.asList("Apple", "Grape", "Strawberry", "Orange", "Blackberry");
        List<String> stringResult = strings.stream()
                .filter(s -> s.length() > 5 && !s.equals("Strawberry"))
                .collect(Collectors.toList());
        System.out.println(stringResult);

        stringResult = strings.stream()
                .filter(s -> {
                    int size = s.length();
                    if (size > 5 && !s.equals("Strawberry")) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());

    }
}
