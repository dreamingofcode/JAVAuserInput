import java.util.Scanner;

public class Sequencing {
    public static void main( String[] args ){
        Scanner keyboard= new Scanner(System.in);
        double price  , salesTax, total;

        // salesTax= price *0.0825;
        
        System.out.println("How much is the purchase price?");
        price=  keyboard.nextDouble();
        
        System.out.println("What percentage is the sales tax?");
        total= (keyboard.nextDouble() * price);
        total= total + price;
        // total= price + salesTax;
        System.out.println("Your total: \t \t"+ total );
    }
}
