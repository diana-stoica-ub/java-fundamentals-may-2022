package introduction.array;

public class ArraySumCalculator {

    public static void main(String[] args) {
        long[] values = {10L , 14L, 50L, 300L};

        long sum = 0;
        for (long value : values) {
            sum = sum + value;
        }

        System.out.println("Sum of elements:" + sum);
    }
}
