package collection.set;

import collection.Employee;
import collection.NameComparator;

import java.util.Set;
import java.util.TreeSet;

import static collection.CollectionPrinter.printSet;

public class TreeSetUsage {

    public static void main(String[] args) {
        Set<Character> characters = new TreeSet<>();

        characters.add('X');
        characters.add('C');
        characters.add('A');
        characters.add('B');
        characters.add('F');

        printSet(characters);

        Set<Employee> employees = new TreeSet<>(new NameComparator());
        employees.add(new Employee("N1", "N1", 100));
        employees.add(new Employee("N3", "N2", 100));
        employees.add(new Employee("N2", "N2", 100));

        printSet(employees);
    }
}
