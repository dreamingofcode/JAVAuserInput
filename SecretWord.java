import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secretWord = "please", secondSecret = "money", guess;

        System.out.println("What is the secret word?");
        guess = input.next();

        if (guess.equals(secretWord )|| guess.equals(secondSecret)) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("No, you are wrong! The secret word is NOT \t" + guess);
        }
        if (guess == secretWord) {
            System.out.println("This will never ever show no matter what!");
        }
    }
}
