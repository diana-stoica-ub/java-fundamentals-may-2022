package collection.map;

import collection.Employee;
import collection.NameComparator;

import java.util.Map;
import java.util.TreeMap;

import static collection.CollectionPrinter.printMap;

public class TreeMapUsage {

    public static void main(String[] args) {

        Map<Integer, Employee> treeMap = new TreeMap<>();

        treeMap.put(2, new Employee("F1", "L1", 100));
        treeMap.put(4, new Employee("F4", "L4", 400));
        treeMap.put(1, new Employee("F2", "L2", 500));

        printMap(treeMap);
        treeMap.put(3, new Employee("F3", "L3", 500));
        System.out.println("After element add:");
        printMap(treeMap);

        Map<Employee, String> treeMapReversed = new TreeMap<>();
        treeMapReversed.put(new Employee("F1", "L1", 100), "First");
        treeMapReversed.put(new Employee("F10", "L10", 300), "Second");
        treeMapReversed.put(new Employee("F5", "L5", 10), "Third");
        printMap(treeMapReversed);

        System.out.println("TreeMap using comparator:");
        treeMapReversed = new TreeMap<>(new NameComparator());
        treeMapReversed.put(new Employee("F1", "L1", 100), "First");
        treeMapReversed.put(new Employee("F10", "L10", 300), "Second");
        treeMapReversed.put(new Employee("F5", "L5", 10), "Third");
        printMap(treeMapReversed);
    }
}
