import java.util.Scanner;

public class InfiniteLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret, guess;
        secret = 1 + (int) (10 * Math.random());
        System.out.println("\nI am thinking of a number between 1-10");
        System.out.println("Try to guess it: ");
        guess = input.nextInt();

        while (secret != guess) {

            System.out.println("Try again!");
            System.out.println("Your Next Guess: ");
            guess = input.nextInt();

        }
        System.out.println("CORRECT! " + guess);

    }
}
