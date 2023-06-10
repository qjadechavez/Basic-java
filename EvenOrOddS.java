import java.util.Scanner;

public class EvenOrOddS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
        } while (!isValidString(input));

        int length = input.length();
        int remainder = length % 2;
        if (length % 2 == 0) {
            System.out.println("Length of the string: " + length);
            System.out.println("The remainder is: " + remainder);
            System.out.println("Therefore the length of the string is even.");
        } else {
            System.out.println("Length of the string: " + length);
            System.out.println("The remainder is: " + remainder);
            System.out.println("Therefore the length of the string is odd.");
        }

        scanner.close();
    }

    private static boolean isValidString(String input) {
        if (input.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty string.");
            return false;
        }

        return true;
    }
}
