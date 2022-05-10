package relationship.inheritance.classes;

public class Animal {

    private String name;
    private String colour;
    protected String protectedField;

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void eat() {
        System.out.println("I eat food!");
    }

    public void eat(String whatIEat) {      //supraincarcare -> overload
        System.out.println("I eat " + whatIEat);
    }

    public void makeNoise() {
        System.out.println("I make noise!");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
