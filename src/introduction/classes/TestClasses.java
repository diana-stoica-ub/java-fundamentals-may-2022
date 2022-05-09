package introduction.classes;

public class TestClasses {

    public static void main(String[] args) {
        Employee employee = new Employee();     //create new object; s-a alocat memorie pentru un nou obiect de tip Employee
                                                //apeleaza constructorii
        employee.printAge();

        Employee employee2 = new Employee("Ion", "Popescu");
        System.out.println(employee2.firstName);
        System.out.println(employee2.lastName);

        employee2.salary = 100;
        employee2.givePromotion(200);

        System.out.println(employee2.salary);

    }
}
