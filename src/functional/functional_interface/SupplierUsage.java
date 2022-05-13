package functional.functional_interface;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierUsage {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "This is a string";

        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());

        BooleanSupplier booleanSupplier = () -> true;
        IntSupplier intSupplier = () -> 1;

    }
}
