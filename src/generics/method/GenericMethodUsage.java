package generics.method;

import introduction.classes.Person;

public class GenericMethodUsage {

    //generic method print
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element);
        }
        System.out.println();
    }

    public static <E, F> void printArrayAndExtraElemnt(E[] array, F element) {
        printArray(array);
        System.out.println("Element:" + element);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        printArray(integers);

        Double[] doubles = {1.1, 2.2, 3.3};
        printArray(doubles);

        Person[] people = new Person[2];
        people[0] = new Person("Nume", "Prenume");
        people[1] = new Person("Nume1", "Prenume1");
        printArray(people);

        printArrayAndExtraElemnt(people, 3);
    }
}
