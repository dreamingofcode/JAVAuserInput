import java.util.Scanner;
public class ForgetfulMachine{
    public static void main(String [] args){
        Scanner keyboard= new Scanner(System.in);

        System.out.println("What city do you live in?");
        keyboard.next();

        System.out.println("What is the number after 69?");
        keyboard.nextInt();

        System.out.println("Enter ant number that is a float integer , hoe!?");
        keyboard.nextDouble();

        System.out.println("What you gonne do hoe!?");
        keyboard.next();

    }
}