package introduction.loop_blocks;

import java.util.Scanner;

public class Calculator {

    //Se citeste primul numar pozitiv
    //Se citeste un operator (+, -, /, *) si al doilea numar pozitiv
    //Daca se citeste "X" -> se inchide aplicatia
    //Daca se citeste "C" -> clear, introducem din nou primul numar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        char operator;
        int number2;

        while (true) {
            String line = scanner.next();
            if ("X".equals(line)) {
                return;
            } else if ("C".equals(line)) {
                number1 = scanner.nextInt();
            } else {
                operator = line.charAt(0);
                number2 = scanner.nextInt();
                number1 = displayResult(number1, number2, operator);
            }
        }

    }
    private static int displayResult(int a, int b, char operator) {
        int result = 0;
        if (operator == '+') {
             result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else {
            System.out.println("Operator not valid");
        }

        System.out.println("=" + result);
        return result;
    }
}
