package EXCEPTIONS.exception_ex1;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
    }

    public int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    public void calculate(String op, int a, int b) {
        if (op.equals("/")) divide(a, b);
        else if (!op.equals("+") && !op.equals("-") && !op.equals("*"))
            System.out.println("Error: Operation '" + op + "' not supported");
    }
}
