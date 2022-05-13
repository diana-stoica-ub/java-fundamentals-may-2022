package functional.functional_interface;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorUsage {

    public static void main(String[] args) {
        UnaryOperator<String> convertToUpperCase = s -> s.toUpperCase();
        System.out.println(convertToUpperCase.apply("String"));

        IntUnaryOperator doubleInt = n -> n*2;
        System.out.println(doubleInt.applyAsInt(1));


        BinaryOperator<String> concatStrings = (s1, s2) -> s1 + s2;
        System.out.println(concatStrings.apply("first", "second"));

        DoubleBinaryOperator substract = (a, b) -> a - b;
        System.out.println(substract.applyAsDouble(1.1, 0.3));

        CustomFunctionalInterface customFunctionalInterface = (a, b, c, d) -> a + b + c + d;
        System.out.println(customFunctionalInterface.sum(1, 2, 3, 4));
    }
}
