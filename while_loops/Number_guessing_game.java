import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int targetNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("=== Welcome to the Number Guessing Game! ===");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        // do-while loop ensures the user is prompted at least once
        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            // Conditional statements to provide feedback
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number within the range 1 to 100.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                System.out.println("Total attempts: " + attempts);
            }

        } while (userGuess != targetNumber); // Loop continues until the user guesses correctly

        sc.close();
    }
}
