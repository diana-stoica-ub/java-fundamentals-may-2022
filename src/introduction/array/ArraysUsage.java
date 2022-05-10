package introduction.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysUsage {

    public static void main(String[] args) {
        int[] numbers = generateRandomArray();

        int[] copiedArray = Arrays.copyOfRange(numbers, 2, 5);
        printArray(copiedArray);

        int[] biggerArray = Arrays.copyOf(numbers, 11);
        biggerArray[10] = 999;
        printArray(biggerArray);

        Arrays.sort(biggerArray);
        printArray(biggerArray);

        System.out.println("Found at: " + Arrays.binarySearch(biggerArray, 999));
        System.out.println("Found at: " + Arrays.binarySearch(biggerArray, 200));


        System.out.println("Comparing arrays:");
        int[] firstArray = generateRandomArray();
        int[] secondArray = generateRandomArray();

        System.out.println("Compare result: " + Arrays.compare(firstArray, secondArray));
        System.out.println("Equals result:" + Arrays.equals(firstArray, secondArray));

        Arrays.fill(firstArray, 1);
        Arrays.fill(secondArray, 1);

        printArray(firstArray);
        printArray(secondArray);

        System.out.println("Compare result: " + Arrays.compare(firstArray, secondArray));
        System.out.println("Equals result:" + Arrays.equals(firstArray, secondArray));


    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(0, 99);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }
}
