import java.util.Scanner;

public class PigDiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int roll, ptot=0,ctot=0,turnTotal;
        String choice="";
do{
    turnTotal=0;
    System.out.println("You have "+ptot+" points!");

    do{
        roll= 1+(int)(Math.random()*6);
        System.out.println("\nYou rolled a " + roll);
            if (roll == 1) {
                System.out.println("\nThat ends your turn!");
                turnTotal = 0;
            } else {
                turnTotal += roll;
                System.out.println("\t You have " + turnTotal);
                System.out.print(" points so far");
                System.out.println("\tWould you like to \"roll\"  again");
                System.out.println("\t OR  \"hold\" ?");
                choice=input.next();
                

            }
    } while(roll !=1 && choice.equals("roll"));
ptot+=turnTotal;
System.out.println("\tYou end the round with"+ ptot+ " points");

if(ptot<=100){
    turnTotal=0;
    System.out.println("Computer has" + ctot+ " points");

}

        do {
            roll = 1 + (int) (6 * Math.random());
            System.out.println("\nComputer rolled a " + roll);
            if (roll == 1) {
                System.out.println("\nThat ends your turn!");
                turnTotal = 0;
            } else {
                turnTotal+= roll;
                System.out.println("\tComputer has " + turnTotal);
                System.out.print(" points so far");
                if (turnTotal < 20) {
                    System.out.println("\tComputer will roll again.");
                }

            }
        } while (roll != 1 && turnTotal < 20);
        ctot=turnTotal;
        System.out.println("Computer ends the round with: " +ctot + " points");
}while(ptot<100 && ctot<100);
    if(ptot>ctot){
        System.out.println("\nHUMANITY WINS!!");
    }
    else(
        System.out.println("\nCOMPUTER WINS!!");
    )
}
    }
}
