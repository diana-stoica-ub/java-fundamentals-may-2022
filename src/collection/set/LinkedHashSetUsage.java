package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

import static collection.CollectionPrinter.printSet;

public class LinkedHashSetUsage {

    public static void main(String[] args) {

        //ordinea de inserare a elementelor se pastreaza
        Set<Character> characters = new LinkedHashSet<>();

        characters.add('X');
        characters.add('C');
        characters.add('A');
        characters.add('B');
        characters.add('F');

        printSet(characters);
    }
}
