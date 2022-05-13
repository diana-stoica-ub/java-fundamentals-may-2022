package functional.functional_interface;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerUsage {

    public static void main(String[] args) {
        Consumer<String> stringPrinter = s -> System.out.println(s);

        stringPrinter.accept("This is a line");
        stringPrinter.accept("This is new line");
        stringPrinter.accept("This is newer line");

        DoubleConsumer doubleConsumer = s -> System.out.println(s + 1);

    }
}
