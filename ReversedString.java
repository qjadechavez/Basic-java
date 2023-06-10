import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    private static String reverseString(String input) {
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }
        return reversedBuilder.toString();
    }
}
