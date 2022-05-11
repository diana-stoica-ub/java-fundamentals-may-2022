package relationship.inheritance.abstract_classes;

import relationship.inheritance.interfaces.Mammal;
import relationship.inheritance.interfaces.Pet;

public class Horse extends Animal  { //public class Horse extends Animal implements Pet, Mammal (...) ->
                                    // putem extinde o clasa (abstracta sau nu) si apoi sa implementam oricate interfete

    private String name;

    public Horse(int noOfLegs) {
        super(noOfLegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("I make noise!");
    }

    public Horse(int noOfLegs, String name) {
        super(noOfLegs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
