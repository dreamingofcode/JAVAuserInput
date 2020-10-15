import java.util.Scanner;
public class AlphabeticalOrdering {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        String name;

        System.out.println("Make up the name of a new programming Language!");
        name= input.next();

        if(name.compareTo("c++")<0)
        System.out.println(name + " comes BEFORE c++");
        if(name.compareTo("c++")==0)
        System.out.println(" c++ is not a made-up language!");    
         if(name.compareTo("c++")>0)
        System.out.println(name + " comes AFTER c++");

        if(name.compareTo("go")<0)
        System.out.println(name + " comes before go");
        if(name.compareTo("go")==0)
        System.out.println("go is not a made-up language ");
        if(name.compareTo("go")>0)
        System.out.println(name + " comes AFTER go");

        if(name.compareTo("java")<0)
        System.out.println(name + " comes BEFORE java");
        if(name.compareTo("java")==0)
        System.out.println("java is not a made-up language!");
        if(name.compareTo("java")>0)
        System.out.println(name + " comes AFTER java");

        if(name.compareTo("python")<0)
        System.out.println(name + " comes BEFORE python");    
         if(name.compareTo("phyton")>0)
        System.out.println(name + " comes AFTER python");

        if(name.compareTo("ruby")<0)
        System.out.println(name + " comes BEFORE  ruby");    
         if(name.compareTo("ruby")>0)
        System.out.println(name + " comes AFTER ruby");
    }
}
