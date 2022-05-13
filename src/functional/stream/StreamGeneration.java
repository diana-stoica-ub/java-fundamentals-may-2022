package functional.stream;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGeneration {

    public static void main(String[] args) {
        String[] colours = new String[] {"Red", "Green", "Blue", "Purple", "White"};

        //create streams from array
        Stream<String> streamOfColours1 = Arrays.stream(colours);

        Stream<String> streamOfColours2 = Stream.of(colours);

        Stream<String> streamOfColours3 = Stream.of("Red", "Green", "Blue");

        //create stream from List
        List<String> coloursList = new ArrayList<>(Arrays.asList(colours));
        Stream<String> streamOfColours4 = coloursList.stream();

        //create stream from Set
        Set<String> setOfColours = Set.of("Red", "Green", "Blue");
        Stream<String> streamOfColours5 = setOfColours.stream();

        //Empty stream
        Stream<String> emptyStream = Stream.empty();

        //create stream using Stream Builder (Builder = design pattern)
        Stream<String> streamOfColours6 = Stream
                .<String>builder()
                .add("Red")
                .add("Green")
                .add("Blue")
                .build();

        useStream(Stream.<String>builder().add("Red").add("Green").add("Blue").build());

        //Generate stream using generate
        Stream<String> greens = Stream.generate(() -> "Green").limit(10);
        // "Green","Green", "Green", "Green", "Green", "Green", "Green", "Green",

        //convert to collection -> collect
        List<String> greensList = greens.collect(Collectors.toList());
        System.out.println(greensList);


        //Generate using iterate
        Stream<Integer> numbers = Stream.iterate(2, (n) -> n + 2).limit(10);
        System.out.println(numbers.collect(Collectors.toList()));

        numbers = Stream.iterate(2, n -> n + 2).limit(10);  //daca avem un singur parametru in expresia lambda, atunci putem omite parantezele
        System.out.println(numbers.collect(Collectors.toList()));

        numbers = Stream.iterate(2, (n) -> {
            int newNumber = n + 2;
            newNumber = newNumber * 3;
            return newNumber;
        }).limit(10);
        System.out.println(numbers.collect(Collectors.toList()));

        //generate using a string
        String line = "This is a line";
        Stream<String> words = Pattern.compile(" ").splitAsStream(line);
        System.out.println(words.collect(Collectors.toList()));

        //Generate streams of primitives
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(element -> System.out.print(element + " "));
        System.out.println();

        intStream = IntStream.rangeClosed(1, 3);

    }

    private static void useStream(Stream<String> stream) {
        //do stuff...
    }
}
