package functional.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionUsage {

    public static void main(String[] args) {

        //Function
        //used by .map()
        Function<String, Integer> convertWordToLength = word -> word.length();

        List<String> words = Arrays.asList("one", "two", "three");
        List<Integer> convertedList = words.stream().map(convertWordToLength).collect(Collectors.toList());

        Integer lengthOfTen = convertWordToLength.apply("ten");
        System.out.println(lengthOfTen);

        //BiFunction
        BiFunction<String, Integer, Boolean> biFunction = (s, n) -> {
            int length = s.length();
            int result = length - n;
            return result > 0;
        };
        //BiFunction<String, Integer, Boolean> biFunction2 = (s, n) -> s.length() - n > 0 ? true : false;
        BiFunction<String, Integer, Boolean> biFunction2 = (s, n) -> s.length() - n > 0;

        Boolean result = biFunction.apply("one", 10);


        DoubleFunction<String> doubleToString = n -> Double.toString(n);
        System.out.println(doubleToString.apply(123.5));

        DoubleToIntFunction doubleToIntFunction = num -> (int) num;
        System.out.println(doubleToIntFunction.applyAsInt(123.8));

        ToDoubleBiFunction<Integer, Integer> power = (a, b) -> Math.pow(a, b);
        System.out.println(power.applyAsDouble(2, 4));


        //Math class
        System.out.println(Math.round(123.8));
        System.out.println(Math.round(Math.abs(-1)));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 3));



    }
}
