package introduction.string;

public class StringEqualsTest {

    public static void main(String[] args) {
        String s1 = new String("This is a string");
        String s2 = new String("This is a string");

        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        }
        if (s1 == s2) {
            System.out.println("s1 == s2");
        }

        String s3 = "This is a string";
        String s4 = "This is a string";

        if (s3.equals(s4)) {
            System.out.println("s3 equals s4");
        }
        if (s3 == s4) {
            System.out.println("s3 == s4");
        }
    }
}
