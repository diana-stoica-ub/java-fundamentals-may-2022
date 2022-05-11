package relationship.inheritance.interfaces;

public interface Mammal extends Animal {

    String produces = "Milk;";      //by default public si final, practic o constanta

    void printFurColour();

    default void printNumberOfLegs() {
        System.out.println("I have 4 legs!");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    static void printDescription() {
        System.out.println("I am a mammal.");
    }

    default void test() {
        System.out.println("Test from Mammal");
    }

}
