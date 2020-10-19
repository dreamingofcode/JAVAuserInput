import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int) (100 * Math.random());
        System.out.println("\nI am thinking of a number between 1-100");
        System.out.println("Try to guess it: ");
        guess = input.nextInt();

        while (secret != guess) {
            if (guess < secret) {
                System.out.println("Sorry your guess is too LOW");

            }
            if (guess > secret) {
                System.out.println("Sorry your guess is too HIGH");

            }
            System.out.println("Try again!");
            guess = input.nextInt();
        }

        System.out.println("YOU GUESSED CORRECTLY! It was " + guess);

    }

}
