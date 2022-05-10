package introduction.string;

public class StringComparator {

    //compara 2 stringuri (ignore case)
    public static void main(String[] args) {
        String s1 = "THIS is A STRING";
        String s2 = "tHis is a ANOTHER string";

        //s1.compareToIgnoreCase - alternativa
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else {
            System.out.println("s1 == s2");
        }
    }
}
