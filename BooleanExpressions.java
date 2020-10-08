import java.util.Scanner;

public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a, b, c, d, e, f;
        double x, y;

        System.out.println("Please provide me with a number: ");
        x = input.nextDouble();

        System.out.print("Now give me a second number to compare: ");
        y = input.nextDouble();

        a = (x < y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x > y);
        f = (x >= y);

        System.out.println(x + " is LESS THAN "+ y + ": "+a);
        System.out.println(x + " is LESS THAN/ EQUAL TO "+ y + ": "+b);
        System.out.println(x + " is EQUAL TO"+ y + ": "+c);
        System.out.println(x + " is NOT EQUAL TO "+ y + ": "+d);
        System.out.println(x + " is GREATER THAN "+ y + ": "+e);
        System.out.println(x + " is GREATER THAN / EQAUL TO"+ y + ": "+f);


        System.out.println(!(x<y) + "\t" + (x>=y));
        System.out.println(!(x<=y) + "\t" + (x>y));
        System.out.println(!(x==y) + "\t" + (x!=y));
        System.out.println(!(x!=y) + "\t" + (x==y));
        System.out.println(!(x>y) + "\t" + (x<=y));
        System.out.println(!(x>=y) + "\t" + (x<y));
   
    }
}
