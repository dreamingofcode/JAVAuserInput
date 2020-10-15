import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math;

        out.println("Welcome to UT Austin College Admissions Interface!");
        out.print("Please enter your SAT math score (200-800): ");
        math = input.nextInt();

        out.print("Admittance status: ");
        if (math >= 790) {
            out.println("Certain");
        } else if (math >= 710) {
            out.println("Safe");

        } else if (math >= 580) {
            out.println("Probable");

        } else if (math >= 500) {
            out.println("Uncertain");

        } else if (math >= 390) {
            out.println("Unlikely");

        } else {
            out.println("Denied");
        }
    }
}
