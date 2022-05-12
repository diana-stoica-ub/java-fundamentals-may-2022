package collection.set;

import collection.Employee;

import java.util.HashSet;
import java.util.Set;

import static collection.CollectionPrinter.printSet;

public class HashSetUsage {

    public static void main(String[] args) {

        //nu se garanteaza ordinea de insertie
        //daca avem un set ce contine clase custom (eg: Employee) - trebuie sa suprascriem in aceasta metoda equals() (si in consecinta si hashCode() )
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("FirstName1", "LastName1", 100));
        employees.add(new Employee("FirstName3", "LastName3", 300));
        employees.add(new Employee("FirstName2", "LastName2", 900));

        printSet(employees);

        employees.add(new Employee("FirstName2", "LastName2", 900));
        printSet(employees);

    }
}
