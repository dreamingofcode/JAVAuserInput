import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;

        System.out.println("What is your height in M: ");
        m = keyboard.nextDouble();

        System.out.print("What is your weight in KG: ");
        kg = keyboard.nextDouble();

        bmi = kg / (m * m);

        System.out.print("Your BMI is " + bmi);
    }
}