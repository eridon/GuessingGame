import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int tries = 0;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        while (guess != secretNum) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            tries++;
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            }
        }

        System.out.println("You got it! The number was " + secretNum + ".");
        System.out.println("It took you " + tries + " tries.");
    }
}
