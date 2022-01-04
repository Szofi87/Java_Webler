package calculator;

public class InvalidSyntaxException extends Exception {

    public InvalidSyntaxException(String message) {

        super("Invalid syntax:" + message);
    }

}
