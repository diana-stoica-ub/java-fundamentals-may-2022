package introduction.wrappers;

public class WrapperUsage {

    public static void main(String[] args) {
        Integer intWrapped = 5;         //autoboxing
        Double doubleWrapped = 4.77;
        Character characterWrapped = 'c';
        Boolean booleanWrapped = false;

        intWrapped = Integer.valueOf(7);
        System.out.println(intWrapped);
        intWrapped = Integer.valueOf("15");
        System.out.println(intWrapped);
        intWrapped = Integer.MAX_VALUE;
        intWrapped = Integer.MIN_VALUE;

        booleanWrapped = Boolean.valueOf(true);
        booleanWrapped = Boolean.valueOf("false");
        booleanWrapped = Boolean.TRUE;

        characterWrapped = Character.valueOf('d');

        int primitiveInt = intWrapped.intValue();
        boolean primitiveBoolean = booleanWrapped.booleanValue();
        char primitiveChar = characterWrapped.charValue();

        displayPrimitive(intWrapped);
        displayPrimitive(primitiveInt);

        displayWrapper(intWrapped);
        displayWrapper(primitiveInt);
    }

    private static void displayPrimitive(int number) {
        System.out.println(number);
    }

    private static void displayWrapper(Integer number) {
        System.out.println(number);
    }
}
