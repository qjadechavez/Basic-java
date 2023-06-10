import java.util.Scanner;

// comment

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getValidNumber(scanner, "Enter a positive number: ");

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }

    private static int getValidNumber(Scanner scanner, String prompt) {
        int number = 0;
        boolean isValidInput = false;
        do {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!isValidInput);

        return number;
    }
}
