package introduction.classes;

public class ParametersTest {

    public static void main(String[] args) {
        int primitive = 10;
        System.out.println("Primitive value before change: " + primitive);
        changePrimitiveValue(primitive);
        System.out.println("Primitive value after change: " + primitive);

        primitive = changeAndGetPrimitiveValue(primitive);
        System.out.println("Primitive value after change second method: " + primitive);

        Person person = new Person("Ion", "Pop");
        System.out.println("Person before change: " + person);
        changeObjectValue(person);
        System.out.println("Person after change: " + person);

        changeObjectReference(person);
        System.out.println("Person after reference change: " + person);
    }

    private static void changeObjectReference(Person person) {
        person = new Person("Maria", "Ionescu");
    }
    private static void changeObjectValue(Person person) {
        person.setFirstName("Ionela");
        person.setLastName("Popescu");
    }

    private static void changePrimitiveValue(int primitive) {
        primitive = primitive + 3;
        System.out.println("Primitive value inside method: " + primitive);
    }

    private static int changeAndGetPrimitiveValue(int primitive) {
        primitive = primitive + 3;
        System.out.println("Primitive value inside second method: " + primitive);
        return primitive;
    }

}
