package EXCEPTIONS.exception_ex2;

public class TooFastException extends Exception {
    public TooFastException(int speed) {
        super("This is an exception of type TooFastException. Speed involved: " + speed);
    }
}
