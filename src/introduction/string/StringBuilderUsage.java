package introduction.string;

public class StringBuilderUsage {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("First part");
        stringBuilder.append("Second part");
        stringBuilder.append("Third part");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        stringBuilder.replace(0, 2, "Zero part");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.reverse();
    }
}
