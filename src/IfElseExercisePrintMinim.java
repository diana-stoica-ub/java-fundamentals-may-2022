import java.util.Scanner;

public class IfElseExercisePrintMinim {

    //se citesc de la tastatura doua numere de tip int
    //sa se afiseze cel mai mic
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        a = scanner.nextInt();

        System.out.println("Enter second number");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("B is minimum: " + b);
        } else if (a == b) {
            System.out.println("Cele 2 numere sunt egale");
        } else {
            System.out.println("A is minimum: " + a);

        }
    }
}
