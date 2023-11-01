import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("The secret number is higher. Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("The secret number is lower. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
                System.out.println("It took you " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
