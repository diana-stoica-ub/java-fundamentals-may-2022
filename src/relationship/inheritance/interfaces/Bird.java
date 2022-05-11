package relationship.inheritance.interfaces;

public interface Bird extends Animal {

    String getFeathersColour();

    default void fly() {
        System.out.println("I can fly");
    }
}
