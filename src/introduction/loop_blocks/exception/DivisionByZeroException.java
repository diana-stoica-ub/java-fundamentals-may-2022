package introduction.loop_blocks.exception;

public class DivisionByZeroException extends Exception {

    private String code;

    public DivisionByZeroException(String message) {
        super(message);
    }
}
