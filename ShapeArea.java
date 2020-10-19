import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double area = 0;

        System.out.println("\nShape Are Calculator vesion 0.1");

        do {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("1) Triangle");
            System.out.println("2) Circle");
            System.out.println("3) Rectanlge");
            System.out.println("4) Square");
            System.out.println("5) Quit");

            System.out.println("> ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Base: ");
                int b = input.nextInt();
                System.out.print("Height: ");
                int h = input.nextInt();
                area = computeTriangle(b, h);
                System.out.print("\nThe area is " + area);

            }

            else if (choice == 2) {
                System.out.println("Radius: ");
                int r = input.nextInt();

                area = computeCircle(r);
                System.out.print("\nThe area is " + area);

            }

            else if (choice == 3) {
                System.out.println("length: ");
                int l = input.nextInt();
                System.out.println("Width: ");
                int w = input.nextInt();
                System.out.print("\nThe area is " + computeRectanlge(l, w));

            }

            else if (choice == 4) {
                System.out.println("length of one side: ");
                int l = input.nextInt();
               
                System.out.print("\nThe area is " + Math.pow(l, 2));

            }
            else if (choice != 5) {
                System.out.println("ERROR! ");

            }

        } while (choice != 5);
    }

    public static double computeTriangle(int base, int height) {
        double a;
        a = 0.5 * base * height;
        return a;
    }

    public static double computeCircle(int radius) {
        double a;
        a = Math.PI * radius;
        return a;
    }

    public static double computeRectanlge(int length, int width) {

        return (length * width);
    }
}
