package introduction.array;

public class FindVowels {


    public static void main(String[] args) {
        char[] characters = {'a', 'c', 'd', 'x', 'f', 'o', 'a'};
        //=> 'a' 'o'

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            for (char character : characters) {
                if (character == vowel) {
                    System.out.println("Vowel found: " + vowel);
                    break;
                }
            }
         }
    }
}
