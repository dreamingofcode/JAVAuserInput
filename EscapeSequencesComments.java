public class EscapeSequencesComments{
  public static void main( String[] args){
 4         System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
 5         System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
 6         // System.out.frimp( "Learn Java the Hard Way" );
 7         System.out.print( "Hello\n" ); // This line prints Hello.
 8         System.out.print( "Jello\by\n" ); // This line prints Jelly.
 9         /* The quick brown fox jumped over a lazy dog.
10            Quick wafting zephyrs vex bold Jim. */
11         System.out /* testing */ .println( "Hard to believe, eh?" );
12         System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
13         System.out.println( "\\ // -=- \\ //" );
14         System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
15         System.out.print( "I hope you understand \"escape sequences\" now.\n" );
16         // and comments. :)
17     }
18 }