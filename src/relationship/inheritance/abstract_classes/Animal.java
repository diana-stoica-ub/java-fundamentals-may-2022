package relationship.inheritance.abstract_classes;

public abstract class Animal {

    private int noOfLegs;       //pot folosi si alti modificatori de acces in afara de public, spre deosebire de interfete

    public static final String CONSTANT = "This is a constant field";

    public Animal(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public abstract void makeNoise();

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                '}';
    }
}
