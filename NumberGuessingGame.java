import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            Random rand = new Random();
            
            int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
            int userGuess = 0;
            int attempts = 0;
            
            System.out.println(" Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 100.");
            System.out.println("Try to guess it!\n");
            
            // Loop until the correct guess
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts++;
                
                if (userGuess < numberToGuess) {
                    System.out.println(" Too Low! Try a higher number.\n");
                } else if (userGuess > numberToGuess) {
                    System.out.println(" Too High! Try a lower number.\n");
                } else {
                    System.out.println(" Congratulations! You guessed it right in " + attempts + " attempts.");
                }
            }
        }
    }
}
