package introduction.string;

public class StringUsage {

    public static void main(String[] args) {
        //String literal
        String s1 = "This is a string!";
        System.out.println(s1);

        String s2 = new String("This is another string");
        System.out.println(s2);

        //iterate over a String
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }
        System.out.println();
        //s1.charAt(100);         =>StringIndexOutOfBoundsException

        //String s3 = s1.toUpperCase();
        s1 = s1.toUpperCase();
        System.out.println(s1);
        s1 = s1.toLowerCase();

        String result = s1.replace('s', '$');
        System.out.println(result);
        System.out.println(s1.indexOf('h'));
        System.out.println(s1.indexOf("is"));

        String word1 = "Ceva";
        String word2 = "Altceva";
        result = word1 + word2;
        System.out.println(result);
        result = s1.concat(s2);

        String line = "This is a list of words";
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println(line);
        result = line.substring(3);
        System.out.println(result);
        result = line.substring(3, 5);
        System.out.println(result);

        char[] charArray = result.toCharArray();
    }
}
