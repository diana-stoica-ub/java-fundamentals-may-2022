package collection.list;

import collection.Employee;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static collection.ListPrinter.printArray;

public class LinkedListUsage {

    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        List<Integer> integers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        printArray(integers);

        integers.add(6);
        printArray(integers);

        integers.add(3, 100);
        printArray(integers);

        integers.addAll(Arrays.asList(101, 102, 103));
        printArray(integers);

        integers.addAll(2, Arrays.asList(1000, 10001, 10002));
        printArray(integers);

    }
}
