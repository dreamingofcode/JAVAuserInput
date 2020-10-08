import java.util.Scanner;

public class CompoundBooleans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double cute, income;
        boolean allowed;

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("How much money do you make annually?");
        income = input.nextDouble();

        System.out.println("How cute are you, on a scale from 0.0 to 10.0? ");
        cute = input.nextDouble();

        allowed = (age >= 25 && age < 40 && (income > 50000 || cute >= 8.5));

        System.out.println("You are allowed to date me:" + allowed);

    }
}
