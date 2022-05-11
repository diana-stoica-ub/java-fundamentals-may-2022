package relationship.inheritance.interfaces;

public interface Pet {

    void displayPetMessage();

    default void test() {
        System.out.println("Test from Pet");
    }
}
