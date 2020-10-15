import static java.lang.System.*;
import java.util.Scanner;

public class NestedIfStatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String  first, last, gender;
        String title;
        out.println("Your first name: ");
        first = input.next();

        out.println("Your last name: ");
        last = input.next();

        out.println("Your Gender {F or M}: ");
        gender = input.next();

        out.println("Your Age: ");
        int age = input.nextInt();
title=first;
        if (age < 20) {
            title = first;

        } else {
            if (gender.equals("F")) {
                out.println("Are you Married? ");
                String married = input.next();
                if (married.equals("yes")) {
                    title = "Mrs.";
                } else if (married.equals("no")) {
                    title = "Ms.";
                }
            } else {
                title = "Mr.";
            }
        }
        out.println("\n " + title + " " + last);
    }

}
