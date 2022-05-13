package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MathOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Count: " + list.stream().count());
        System.out.println("Count %5: " + list.stream().filter(n -> n % 5 == 0).count());

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println("Maxim is: " + max.get());
        } else {
            System.out.println("Maxim is empty");
        }

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println("Min is: " + min.get());
        } else {
            System.out.println("Min is empty");
        }
    }


    public Optional<String> getEntity() {
        String string = readFromDb();

        //daca stim ca obiectul != null
        Optional<String> optionalPresent = Optional.of("Ceva");     //Optional.of(null) => NullPointerException

        //daca am nevoie de un optional empty
        Optional<Object> empty = Optional.empty();

        //daca nu stiu daca obiectul != null
        return Optional.ofNullable(string);             //Optional.ofNullable(null) -> merge
    }


    private String readFromDb() {
        //implementare

        return "ceva";
    }
}
