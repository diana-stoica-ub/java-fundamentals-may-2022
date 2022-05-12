package collection;

import java.util.List;

public class ListPrinter {

    public static <E> void printArray(List<E> array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
