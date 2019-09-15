import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one of the following:
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        int stored = 77;
        int guess;

        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess what number I am thinking of?");

        do {
            guess = input.nextInt();
            if (guess == stored) {
                System.out.println("You found the number: " + stored + "!");
            }
            else if (guess > stored) {
                System.out.print("The stored number is lower.");
            }
            else {
                System.out.print("The stored number is higher.");
            }
        } while (guess != stored);
    }
}
