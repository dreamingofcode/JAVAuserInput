public class YachtDice {
    public static void main(String [] args){
        int r1,r2,r3,r4,r5, count=0;
        boolean allSame=false;

        do{
            count+=1;
            r1= 1+ (int)(Math.random()*6);
            r2= 1+ (int)(Math.random()*6);
            r3= 1+ (int)(Math.random()*6);
            r4= 1+ (int)(Math.random()*6);
            r5= 1+ (int)(Math.random()*6);

            System.out.println("Your Rolled: "+r1+" ,"+r2+" ,"+r3+" ,"+r4+" ,"+r5);
            showDice(r1);
            showDice(r2);
            showDice(r3);
            showDice(r4);
            showDice(r5);

            allSame=(r1==r2 && r2==r3 && r3==r4 && r4==r5);
        }while(! allSame);
        System.out.println("The Yacht!! With "+ count+" rolls!");
    }

    public static void showDice(int roll) {
        System.out.println("+---+");
        if (roll == 1) {
            System.out.println("|   |");
            System.out.println("| o |");
            System.out.println("|   |");

        }
       else if (roll == 2) {
            System.out.println("|o  |");
            System.out.println("|   |");
            System.out.println("|  o|");

        }
        if (roll == 3) {
            System.out.println("|o  |");
            System.out.println("| o |");
            System.out.println("|  o|");

        }
        if (roll == 4) {
            System.out.println("|o o|");
            System.out.println("|   |");
            System.out.println("|o o|");

        }
        if(roll==5){
            System.out.println("|o o|");
            System.out.println("| o |");
            System.out.println("|o o|");
    
            }
            if(roll==6){
                System.out.println("|o o|");
                System.out.println("|o o|");
                System.out.println("|o o|");
        
                }
        System.out.println("+---+");
    }
}
