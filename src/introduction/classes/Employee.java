package introduction.classes;

public class Employee {

    //atribute, mebrii, fields, data
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean active;
    private long salary;
    private ContractType contractType;

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

    //getters and setters
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //metode
    public void printAge() {
        System.out.println("Employee age: " + age);
    }

    public void fireEmployee() {
        this.active = false;
    }


    public void givePromotion(long newSalary) {
        this.salary = newSalary;
    }


}
