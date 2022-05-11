package generics.method;

import generics.generic_class.GenericBox;
import relationship.composition.Book;

public class Main {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.add(1);

        GenericBox<Book> bookBox = new GenericBox<>();
        GenericBox<String> stringBox = new GenericBox<>();
    }
}
