package introduction.string;

public class CharacterCounter {

    public static void main(String[] args) {
        String s1 = "This is 1 big string";

        int noOfDigits = 0;
        int noOfLetters = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                noOfDigits++;
            } else if (Character.isAlphabetic(s1.charAt(i))) {
                noOfLetters++;
            }
        }
        System.out.println("Letters: " + noOfLetters + "\nDigits: " + noOfDigits);
    }
}
