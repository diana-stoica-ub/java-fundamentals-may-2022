package collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getFirstName().compareTo(employee2.getFirstName()) > 0) {
            return 1;
        } else if (employee1.getFirstName().compareTo(employee2.getFirstName()) < 0) {
            return -1;
        } else if (employee1.getLastName().compareTo(employee2.getLastName()) > 0) {
            return 1;
        } else if (employee1.getLastName().compareTo(employee2.getLastName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
