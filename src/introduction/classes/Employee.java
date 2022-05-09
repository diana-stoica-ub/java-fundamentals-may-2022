package introduction.classes;

public class Employee {

    //atribute, mebrii, fields, data
    long id;
    String firstName;
    String lastName;
    int age;
    boolean active;
    long salary;

    //constructor

    Employee() {
        //default constructor
    }

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = true;
    }

    public Employee(long id, String firstName, String lastName, int age, boolean active, long salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.active = active;
        this.salary = salary;
    }

    //metode
    void printAge() {
        System.out.println("Employee age: " + age);
    }

    void fireEmployee() {
        this.active = false;
    }

    long getId() {
        return this.id;
    }

    void givePromotion(long newSalary) {
        this.salary = newSalary;
    }


}
