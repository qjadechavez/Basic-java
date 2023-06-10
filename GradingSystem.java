import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numericalGrade;
        String letterGrade;

        do {
            System.out.print("Enter your numerical grade (0-100): ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid numerical grade.");
                System.out.print("Enter your numerical grade (0-100): ");
                input.next();
            }
            numericalGrade = input.nextInt();

            if (numericalGrade < 0 || numericalGrade > 100) {
                System.out.println("Invalid input! Please enter a numerical grade between 0 and 100.");
            }
        } while (numericalGrade < 0 || numericalGrade > 100);

        if (numericalGrade >= 90 && numericalGrade <= 100) {
            letterGrade = "A";
        } else if (numericalGrade >= 80 && numericalGrade <= 89) {
            letterGrade = "B";
        } else if (numericalGrade >= 70 && numericalGrade <= 79) {
            letterGrade = "C";
        } else if (numericalGrade >= 60 && numericalGrade <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Your grade is: " + letterGrade);

        input.close();
    }
}
