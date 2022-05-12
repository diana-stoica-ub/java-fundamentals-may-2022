package collection.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static collection.CollectionPrinter.printMap;

public class CharacterCounter {

    /**
     * Se citeste un String de la consola
     * Sa se afiseze numarul de aparitii pentru fiecare litera, in ordine alfabetica
     *
     * Input: "abracadabra"
     * a:5
     * b:2
     * c:1
     * d:1
     * r:2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        Map<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {
            Character character = word.charAt(i);
            if (result.get(character) != null) {
                result.put(character, result.get(character) + 1);
            } else {
                result.put(character, 1);
            }
        }




        printMap(result);
    }
}
