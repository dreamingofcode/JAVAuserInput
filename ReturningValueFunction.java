public class ReturningValueFunction {
    public static void main(String[] args) {
        double a, g;
        String tws = "A triangle with sides ";

        a = triangleArea(3, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has an area of " + a);

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has an area of " + a);

        g = triangleArea(7, 8, 9);
        System.out.println("A triangle with sides 7,8,9 has an area of " + g);

        System.out.println(tws + " 5,12,13 has an area of " + triangleArea(5, 12, 13));
        System.out.println(tws + " 10,9,11 has an area of " + triangleArea(10, 9, 11));
        System.out.println(tws + " 8,15,17 has an area of " + triangleArea(8, 15, 17));
        System.out.println(tws + " 9,9,9 has an area of " + triangleArea(9, 9, 9));

    }

    public static double triangleArea(int a, int b, int c) {
        double result, z;

        z = (a + b + c) / 2.0;
        result = Math.sqrt(z * (z - a) * (z - b) * (z - c));
        return result;
    }
}
