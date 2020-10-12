import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bmi,weight,height;

        System.out.print("Enter your Weight in M: ");
        weight= input.nextDouble();

        System.out.print("Enter your Height in KG: ");
        height = input.nextDouble();

        bmi = height / (weight * weight);
        System.out.println("Your BMI is: " + bmi);

        System.out.print("BMI Category: ");
        if (bmi < 15.0) {
            System.out.print("Very Severely  underweight");
        } else if (bmi <= 16.0) {
            System.out.println("Severely  Underweight ");
        } else if (bmi < 18.5) {

            System.out.println("Underweight ");

        } else if (bmi < 25.0) {
            System.out.println("Normal Weight ");

        } else if (bmi < 30.0) {
            System.out.println("Overweight ");

        } else {
            System.out.println("Moderately obese ");

        }
    }
}
