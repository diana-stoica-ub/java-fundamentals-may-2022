import java.util.Scanner;

public class PrimeNumberExercise {


    //se citeste de la tastatura un numar
    //sa se determine daca este prim

    //10 -> 2, 3, 4, 5
    //7 -> 1, 2, 3
    //9 -> 2, 3, 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("1 is special case - not prime, not non-prime");
            return;
        } else if (number == 0) {
            System.out.println("0 is not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.abs(number) / 2; i++) {
            if (number % i == 0) {
                System.out.println("Number " + number + " is not prime");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number " + number + " is prime");
        }
    }
}
