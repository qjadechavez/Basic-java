import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        do {
            System.out.print("Enter a word: ");
            word = scanner.nextLine().toLowerCase();
        } while (!isValidWord(word));

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("The word is not a palindrome.");
                break;
            }

            left++;
            right--;

            if (left >= right) {
                System.out.println("The word is a palindrome.");
            }
        }

        scanner.close();
    }

    private static boolean isValidWord(String word) {
        if (word.isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty word.");
            return false;
        }

        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c)) {
                System.out.println("Invalid input. Please enter a word containing only letters.");
                return false;
            }
        }

        return true;
    }
}
