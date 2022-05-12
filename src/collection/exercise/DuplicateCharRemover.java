package collection.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharRemover {

    //Se citeste un String de la consola
    //Sa se elimine literele duplicate
    public static void main(String[] args) {
        //apple => aple

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        Set<Character> result = new LinkedHashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                throw new RuntimeException("Word invalid - only letters allowed");
            }
            result.add(word.charAt(i));
        }

        for (Character character : result) {
            System.out.print(character);
        }
    }
}
