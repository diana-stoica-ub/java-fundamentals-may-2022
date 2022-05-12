package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static collection.CollectionPrinter.printMap;

public class LinkedHashMapUsage {

    public static void main(String[] args) {

        Map<Integer,String> sizes = new LinkedHashMap<>();
        //ordinea de inserare va fi pastrata garantat
        sizes.put(34, "XS");
        sizes.put(36, "S");
        sizes.put(38, "M");

        printMap(sizes);

        Set<Map.Entry<Integer, String>> entrySet = sizes.entrySet();

    }
}
