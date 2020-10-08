public class VariableChangeShortcuts {
    public static void main(String[] args) {
        int i, j, k;
        i = 5;
        j = 5;
        k = 5;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);
        i = i + 3;
        j = j - 3;
        k = k * 3;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);
        i = 5;
        j = 5;
        k = 5;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);
        i += 3;
        j -= 3;
        k *= 3;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);
        i = j = 5;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);

        i++;
        j--;
        System.out.println("i: " + i + "\t j: " + j + "\t k: " + k);
        i -= 6;

        System.out.println("i: " + i );
        i=5;
        System.out.println("i: " + i );

        i++;i++;i++;i++;i++;
        System.out.println("i: " + i );

    }
}
