import java.util.Scanner;

public class Accumulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int current, total = 0;

        System.out.println("\n Type in a bunch of values and I will add them up!");
        System.out.println("I'll stop when you type zero.");

        do {
            System.out.print("\n VALUE: ");
            current = input.nextInt();
            total += current;
            if (current != 0) {
                System.out.println("\n The total so far is: " + total);
            }

        } while (current != 0);
        System.out.println("\n The final total is: " + total);

    }
}