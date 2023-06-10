import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username;
        boolean isValid = false;

        // Success Message
        do {
            System.out.print("Enter a username: ");
            username = scanner.nextLine();
            isValid = isValidUsername(username);
        } while (!isValid);

        System.out.println("The username is valid.");

        scanner.close();
    }

    private static boolean isValidUsername(String username) {
        if (!isValidLength(username) || !isValidCharacters(username) || !hasCaseSensitivity(username)
                || !startsWithLetter(username)) {
            return false;
        }
        return true;
    }

    // Length Validation
    private static boolean isValidLength(String username) {
        int minLength = 6;
        int maxLength = 20;

        if (username.length() < minLength || username.length() > maxLength) {
            System.out.println("Error: The username must have a minimum length of " + minLength
                    + " characters and a maximum length of " + maxLength + " characters.");
            return false;
        }
        return true;
    }

    // Character Validation
    private static boolean isValidCharacters(String username) {
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Error: The username can only contain alphanumeric characters (letters and numbers).");
            return false;
        }
        return true;
    }

    // Case Sensitivity Validation
    private static boolean hasCaseSensitivity(String username) {
        if (!username.matches(".*[a-z].*") || !username.matches(".*[A-Z].*")) {
            System.out.println(
                    "Error: The username must contain at least one uppercase letter and one lowercase letter.");
            return false;
        }
        return true;
    }

    // Start Character Validation
    private static boolean startsWithLetter(String username) {
        if (!Character.isLetter(username.charAt(0))) {
            System.out.println("Error: The username must start with a letter.");
            return false;
        }
        return true;
    }
}
