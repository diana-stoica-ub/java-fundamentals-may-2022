package collection.map;

import collection.Employee;
import collection.EmployeeIdentifier;

import java.util.HashMap;
import java.util.Map;

import static collection.CollectionPrinter.printMap;

public class HashMapUsage {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        //HashMap nu garanteaza ca ordinea de inserare a elementelor se pastreaza
        System.out.println("Add elements into the map: ");
        dictionary.put("apple", "A kind of fruit");
        dictionary.put("Java", "A programming language");
        String result = dictionary.put("Class", "Abstraction of an object");

        printMap(dictionary);
        System.out.println("Result from put: " + result);

        result = dictionary.put("Java", "Not a programming language");
        System.out.println("Result from second put: " + result);
        printMap(dictionary);

        System.out.println("Apple definition: " + dictionary.get("apple"));

        System.out.println("Size of the map: " + dictionary.size());

        dictionary.putIfAbsent("apple", "Not a fruit");
        printMap(dictionary);

        System.out.println("Remove object: ");
        dictionary.remove("apple");
        printMap(dictionary);

        dictionary.replace("Class", "New class definiton");
        printMap(dictionary);


        //daca vrem sa folosim pe post de cheie intr-un map o clasa custom (eg: EmployeeIdentifier) trebuie sa suprascriem metodele equals() si hashCode()
        //pot fi generate folosind IntelliJ
        Map<EmployeeIdentifier, Employee> mapOfEmployees = new HashMap<>();
        mapOfEmployees.put(new EmployeeIdentifier("Cod1", 1, 100), new Employee("N1", "P1", 1));
        mapOfEmployees.put(new EmployeeIdentifier("Cod2", 2, 200), new Employee("N2", "P2", 1));
        mapOfEmployees.put(new EmployeeIdentifier("Cod3", 3, 300), new Employee("N3", "P3", 1));


        Employee employee = mapOfEmployees.get(new EmployeeIdentifier("Cod2", 2, 200));
    }


}
