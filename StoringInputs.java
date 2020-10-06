import java.util.Scanner;

public class StoringInputs {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. Como te llamas?");
        name = keyboard.next();

        System.out.println("Hi" + name + " , how old are you?");
        age = keyboard.nextInt();

        System.out.println("If you are " + age + "years old, how much do you weight(double)?");
        weight = keyboard.nextDouble();

        System.out.println("How much money do you make at this age of "+ age+" ?");
        income=keyboard.nextDouble();

    }

}