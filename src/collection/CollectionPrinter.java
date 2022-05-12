package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPrinter {

    public static <E> void printArray(List<E> array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> pair : map.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "  ;Value: " + pair.getValue());
        }
    }

    public static <K> void printSet(Set<K> set) {
        for (K element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
