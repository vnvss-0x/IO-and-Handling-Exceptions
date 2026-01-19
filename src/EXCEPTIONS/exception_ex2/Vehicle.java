package EXCEPTIONS.exception_ex2;

public class Vehicle {
    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) throw new TooFastException(speed);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.testSpeed(100);
        } catch (TooFastException e) {
            e.printStackTrace();
        }
    }
}
