package introduction.classes;

import java.util.Objects;

public class TestClasses {

    public static void main(String[] args) {
        Employee employee = new Employee();     //create new object; s-a alocat memorie pentru un nou obiect de tip Employee
                                                //apeleaza constructorii
        employee.printAge();

        Employee employee2 = new Employee("Ion", "Popescu");
        System.out.println(employee2.getFirstName());
        System.out.println(employee2.getLastName());

        employee2.setSalary(100);
        employee2.setContractType(ContractType.FULL_TIME);
        employee2.givePromotion(200);

        System.out.println("employee2 contract: "
                + employee2.getContractType().getMessage() + " " +
                + employee2.getContractType().getNumberOfHoursWorked());
        System.out.println(employee2.getSalary());


        //objects equality
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("John", "Doe");
        Person p3 = p1;     //p1 == p3 => true

        if (p1.equals(p2)) {
            System.out.println("Equal objects");
        } else {
            System.out.println("Not equal objects");
        }

        if (Objects.equals(p1, p2)) {
            System.out.println("Equal objects");
        }

        Person[] people = new Person[10];
        people[0] = p1;
        people[1] = p2;
        for (Person p : people) {
            System.out.println(p);
        }

    }
}
