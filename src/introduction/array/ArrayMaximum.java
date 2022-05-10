package introduction.array;

import java.util.Arrays;

public class ArrayMaximum {

    public static void main(String[] args) {
        int[] numbers = ArraysUsage.generateRandomArray();

        Arrays.sort(numbers);
        ArraysUsage.printArray(numbers);
        System.out.println("The maximum is: " + numbers[numbers.length -1]);

        numbers = ArraysUsage.generateRandomArray();
        int max = Integer.MIN_VALUE;
        for (int value : numbers) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("The maximum is: " + max);

    }
}
