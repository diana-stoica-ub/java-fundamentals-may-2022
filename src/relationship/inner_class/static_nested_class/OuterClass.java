package relationship.inner_class.static_nested_class;

public class OuterClass {

    private static String message = "message";

    public static class StaticInnerClass {

        public void printMessage() {
            System.out.println(message);
        }
    }
}
