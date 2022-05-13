package functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDistinctOperation {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("A", "C", "A", "B", "X", "D", "Z", "L", "A");

        List<String> distinct = letters.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        List<String> sorted = letters.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        //Atunci cand ordinea operatiilor aplicate pe stream nu ne afecteaza rezultatul
        //(Ex: aici, daca le sortam inainte de distinct sau dupa, rezultatul va fi acelasi)
        //Este bine sa punem mai intai operatiile care imi scurteaza stream-ul (ex: distinct va
        //scoate un stream de lungime mai mica, deci ar treubi sa fie inainte de sort
        System.out.println(letters.stream().distinct().sorted().collect(Collectors.toList()));

    }
}
