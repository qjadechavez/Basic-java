import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double result;

            try {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Error: Cannot divide by zero.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (Y/N): ");
            String choice = input.next();

            continueCalculating = choice.equalsIgnoreCase("Y");
        }

        input.close();
    }
}
