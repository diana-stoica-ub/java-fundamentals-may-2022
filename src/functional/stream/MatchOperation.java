package functional.stream;

import java.util.stream.Stream;

public class MatchOperation {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");

        boolean anyMatch = stream.anyMatch(s -> s.length() == 3);
        System.out.println("Any match: " + anyMatch);

        //Daca am aplicat deja o operatie terminala pe Stream, nu mai putem aplica inca una apoi, stream-ul este inchis
        //=> IllegalStateException
        stream = Stream.of("one", "two", "three", "four");
        boolean noneMatch = stream.noneMatch(s -> s.length() == 10);
        System.out.println("None match: " + noneMatch);


        stream = Stream.of("one", "one", "twoo");
        boolean allMatch = stream.allMatch(s -> s.length() == 3);
        System.out.println("All match: " + allMatch);



    }
}
