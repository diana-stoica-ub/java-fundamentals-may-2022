package collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static collection.CollectionPrinter.printArray;

public class MaxAppearanceCharacter {

    /**
     * Se citeste un cuvant
     * Sa se afiseze litera cu cele mai multe aparitii
     *
     * ex: apple
     * p: 2
     *
     * ex: 11222234
     * 2 : 4
=    */
    public static void main(String[] args) {
        // index 0 ... index 9

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int[] appearances = new int[10];

        for (int i = 0; i < word.length(); i++) {
            Integer digit = Integer.parseInt(String.valueOf(word.charAt(i)));
            appearances[digit] =  appearances[digit] + 1;
        }

        int max = -1;
        int maxDigit = -1;
        for (int i = 0; i < appearances.length; i++) {
            System.out.println("Index: " + i + "; NoOfApp: " + appearances[i]);
            if (max < appearances[i]) {
                max = appearances[i];
                maxDigit = i;
            }
        }
        System.out.print("Max digit:" + maxDigit + "; max appearences: " + max);

        word = scanner.next();

        int[] appearancesLetters = new int[50];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            appearancesLetters[c - 'a'] = appearancesLetters[c - 'a'] + 1;
        }
        for (int i = 0; i < appearancesLetters.length; i++) {
            char c = (char) (i + 'a') ;
            System.out.println("Index: " + c + "; NoOfApp: " + appearancesLetters[i]);
        }

    }
}
