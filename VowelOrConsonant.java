import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid letter.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single character.");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
