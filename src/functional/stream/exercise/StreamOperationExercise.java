package functional.stream.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOperationExercise {

    public static void main(String[] args) {
        //Se da un ArrayList de Stringuri; -> to upper case

        List<String> words = Arrays.asList("one", "two", "three");

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //Se citeste un ArrayList de numere; sa se afiseze media aritmetica
        //(a + b + c) / 3

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8, 9, 10);

        long count = numbers.stream().count();

        Optional<Integer> sumOptional = numbers.stream().reduce((n1, n2) -> n1 + n2);
        if (sumOptional.isPresent() && count != 0) {
            System.out.println("Media aritmetica: " + sumOptional.get() / count);
        } else {
            System.out.println("Invalid input data");
        }


        //IntStream examples
        numbers.stream().mapToInt(n -> n).sum();
        numbers.stream().mapToInt(n -> n).average();
        numbers.stream().mapToInt(n -> n).min();
        numbers.stream().mapToInt(n -> n).max();


        //Se da un array de stringuri; sa se determine lungimea celui mai lung string
        //"one", "two", "three" -> 5

        Optional<Integer> resultOpt = words.stream()        //Original stream: "one", "two", "three"
                .map(s -> s.length())                       //New stream: 3, 3, 5
                .max(Integer::compareTo);
        if (resultOpt.isPresent()) {
            System.out.println("Result: " + resultOpt.get());
        }
    }
}
