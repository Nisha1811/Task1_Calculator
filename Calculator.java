import java.util.Scanner;

public class Calculator {

    // Method for addition
    static double add(double x, double y) {
        return x + y;
    }

    // Method for subtraction
    static double subtract(double x, double y) {
        return x - y;
    }

    // Method for multiplication
    static double multiply(double x, double y) {
        return x * y;
    }

    // Method for division
    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n--- Simple Calculator ---");

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (yes/no): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("yes")) {
                keepRunning = false;
                System.out.println("Calculator closed.");
            }
        }

        input.close();
    }
}
