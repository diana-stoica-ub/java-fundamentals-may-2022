package introduction.loop_blocks;

import introduction.loop_blocks.exception.DivisionByZeroException;
import introduction.loop_blocks.exception.InvalidOperatorException;

import java.util.InputMismatchException;
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
            try {
                String line = scanner.next();
                if ("X".equals(line)) {
                    return;
                } else if ("C".equals(line)) {
                    number1 = scanner.nextInt();
                } else {
                    operator = line.charAt(0);
                    validateOperator(operator);

                    number2 = scanner.nextInt();
                    validateForDivisionByZero(operator, number2);

                    number1 = displayResult(number1, number2, operator);
                }

            } catch (InvalidOperatorException e) {
                System.out.println("Operator not valid, please use: + , - , / , *");
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Please insert an int");
            }

        }
    }

    private static void validateForDivisionByZero(char operator, int number) throws DivisionByZeroException {
        if (operator == '/' && number == 0) {
            throw new DivisionByZeroException("Division by zero! Please insert a different operator or a number != 0");
        }
    }
    private static void validateOperator(char operator) throws InvalidOperatorException {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new InvalidOperatorException();
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
