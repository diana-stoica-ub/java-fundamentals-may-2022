package functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperation {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("one", "two", "three", "four");
        //=> one;two;three;four

        Optional<String> result = numbers.stream().reduce((s1, s2) -> s1 + ";" + s2);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Empty");
        }
    }
}
