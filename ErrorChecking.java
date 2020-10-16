import java.util.Scanner;
public class ErrorChecking {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        double x,y;
        System.out.println("\nGive me a number, and I'll find its square root!");
        System.out.println("No Negatives please!");
        x=input.nextDouble();


        while(x<0){
            System.out.println("\n0I won't take the square root of a negative");
            System.out.println("I demand a new number: ");
            x=input.nextDouble();

        }
        y=Math.sqrt(x);
        System.out.println("The square root of " +x +" is " +y);
    }
}
