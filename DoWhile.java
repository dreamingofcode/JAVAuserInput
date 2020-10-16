import java.util.Scanner;

public class DoWhile {
  public static void main(String [] args){
      Scanner input= new Scanner(System.in);
      String coin, again;
      int streak=0;
      boolean gotHeads;

      do{
          gotHeads =Math.random()<0.5;

          if(gotHeads)
        coin="Heads";
      else 
      coin= "Tails";

      System.out.println("You Flipped a coin and got"+ coin);

      if(gotHeads){
        streak++;
        System.out.print("\tThat's "+ streak + " in a row!");
        System.out.println("\t Would you like to flip again y/n?");
        again=input.next();
      }
      else{
          System.out.println("\tYou lose everything!");
          System.out.println("\tShould have quit while you could!");
          again="n";
      }}
      while(again.equals("y"));
      System.out.println("Final Score: "+ streak);
  }
}
