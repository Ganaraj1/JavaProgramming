import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the questions and answer choices
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. Who is the author of 'Romeo and Juliet'?"
        };

        String[] choices = {
            "A) Berlin\tB) Madrid\tC) Paris\tD) Rome",
            "A) Venus\tB) Mars\tC) Jupiter\tD) Saturn",
            "A) Charles Dickens\tB) William Shakespeare\tC) Jane Austen\tD) Leo Tolstoy"
        };

        String[] correctAnswers = {"C", "B", "B"};

        int totalQuestions = questions.length;
        int score = 0;

        System.out.println("Welcome to the Multiple Choice Quiz!");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            System.out.println(choices[i]);
            System.out.print("Enter your answer (A, B, C, or D): ");
            
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);

        scanner.close();
    }
}
