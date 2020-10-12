import java.util.Scanner;

public class ClubBouncer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double attractiveness;
        String gender;
        boolean onGuestList;

        System.out.print("How old are you?");
        age = input.nextInt();

        System.out.print("Are you on the guest list, true or false?");
        onGuestList = input.nextBoolean();

        System.out.print("How attractive are you on a scale of 0.0 to 10.0?");
        attractiveness = input.nextDouble();

        System.out.print("What is your Gender, F OR M?");
        gender = input.next();

        if (onGuestList || age >= 21 || (gender.equals("F") && attractiveness >= 8)) {
            System.out.print("Come in your ghood!");

        }
        else {
    System.out.print("GO AWAY!");

        }
    }
}
