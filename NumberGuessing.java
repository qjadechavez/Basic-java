import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guessedNumber;
        int attempts = 0;

        System.out.println("I have generated a random number between 1 and 100.");

        do {
            System.out.print("Guess the number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            guessedNumber = scanner.nextInt();
            attempts++;

            if (guessedNumber < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        } while (guessedNumber != targetNumber);

        scanner.close();
    }
}
