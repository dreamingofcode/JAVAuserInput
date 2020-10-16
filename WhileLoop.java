import java.util.Scanner;



public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin, entry;
        String password="lana del rey", passwordEntry;
        pin = 3369;
        System.out.println("Welcome to Bank Java!");
        System.out.println("\nEnter Your Password and hit ENTER: \t");
        passwordEntry=input.nextLine();
        while ( ! password.equals(passwordEntry)) {
            System.out.println("\nIncorrect Password, Try Again!");
 ;
            passwordEntry = input.nextLine();
        }

        System.out.println("Enter Your Pin: \t");
        entry = input.nextInt();

        while (entry != pin) {
            System.out.println("\nIncorrect Pin, Try Again!");
            System.out.println("Enter Your Pin");
            entry = input.nextInt();
        }
        System.out.println("\nPin Accepted! Your Balance is &=$00.00 you BROKE BI*$#!");
    }
}
