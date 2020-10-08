import java.util.Scanner;

public class WordComparisonCheck {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        String word;
        boolean yes, no;
    

        System.out.println("Type in the word \" PIZZA \" please");
        word= input.next();

        yes= "PIZZA".equals(word);
        no= ! word.equals("PIZZA");

        System.out.println("You typed what was requested and you're an obidient person: "+yes);
        System.out.println("You DID NOT type what was requested and you're AWFUL: "+no);

    }
}
