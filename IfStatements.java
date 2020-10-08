import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println(" YOU ARE: \t");

        if (age < 13) {
            System.out.println("\ttoo young to create a Facebook account");
        }
        if (age < 16) {
            System.out.println("\ttoo young to get a driver's license");
        }
        if (age < 18) {
            System.out.println("\ttoo young to get a tattoo");
        }
        if (age < 21) {
            System.out.println("\ttoo young to drink alcohol");
        }
        if (age < 35) {
            System.out.println("\ttoo young to run for President of the U.S.");
            System.out.println("\t\t(How sad!)");
        }
    }
}
