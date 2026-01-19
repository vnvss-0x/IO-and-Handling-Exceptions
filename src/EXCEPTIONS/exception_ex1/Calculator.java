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

    public void calculate(String operation, int a, int b) {
        if (operation.equals("+")) {
            System.out.println("Result: " + (a + b));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (a - b));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (a * b));
        } else if (operation.equals("/")) {
            System.out.println("Result: " + divide(a, b));
        } else {
            System.out.println("Error: Operation '" + operation + "' not supported");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("--- Testing Division ---");
        calc.divide(10, 0);

        System.out.println("\n--- Testing Conversion ---");
        calc.convertToNumber("abc");

        System.out.println("\n--- Testing Operations ---");
        calc.calculate("&", 5, 5);
        calc.calculate("+", 10, 5);
    }
}