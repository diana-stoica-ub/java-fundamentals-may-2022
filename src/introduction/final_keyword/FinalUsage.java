package introduction.final_keyword;

public class FinalUsage {

    private final String field = "Value";

    public static final String CONSTANT = "Constanta";

    public static void main(String[] args) {
        final Integer x = 10;
        //x = 14;

        //this.field = "Altceva";
    }

    private static void method(final Integer x) {
        //x++;
    }
}
