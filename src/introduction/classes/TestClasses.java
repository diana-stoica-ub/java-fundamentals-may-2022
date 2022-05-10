package introduction.classes;

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

    }
}
