package introduction.conditional_blocks;

import java.util.Scanner;

public class IfElseExerciseSeason {

    //se citeste de la tastatura un numar cuprins intre 1 si 12
    //sa se afiseze anotimpul aferent lunii respective
    //Ex: 3 => primavara
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Not a valid month");
        } else if (month >=3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }
}
