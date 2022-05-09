package introduction.syntax;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String nextLine = scanner.nextLine();
        System.out.println("I have read the text:" + nextLine + "\n");

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("I have read the number: " + number + "\n");
    }


}
