public class ChoosingRandomNums {
    public static void main(String[] args) {
        int a, b, c, d;
        double r, rps;

        rps = Math.random();
        if (rps < 0.333333333) {
            System.out.println("Rock");
        } else if (rps < 0.6666667) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissors");
        }
//random from 1-10
        a = 1 + (int) (10 * Math.random());
        b = 1 + (int) (10 * Math.random());
        c = 1 + (int) (10 * Math.random());
        d = 1 + (int) (10 * Math.random());
        
        System.out.println("1-10: \t" + a + "\t"+b+"\t"+c+"\t"+d);

        //random from 1-6
        a = 1 + (int) (6 * Math.random());
        b = 1 + (int) (6 * Math.random());
        c = 1 + (int) (6 * Math.random());
        d = 1 + (int) (6 * Math.random());
        
        System.out.println("1-6: \t" + a + "\t"+b+"\t"+c+"\t"+d);

        //random single from 1-100
        a = 1 + (int) (100 * Math.random());
        
        System.out.println("1-100: \t" + a + "\t"+a+"\t"+a+"\t"+a);

        //random from 1-100
        a = 1 + (int) (100 * Math.random());
        b = 1 + (int) (100 * Math.random());
        c = 1 + (int) (100 * Math.random());
        d = 1 + (int) (100 * Math.random());
        
        System.out.println("1-100: \t" + a + "\t"+b+"\t"+c+"\t"+d);

        //random from 0-99
        a = 0 + (int) (100 * Math.random());
        b = 0 + (int) (100 * Math.random());
        c =  (int) (100 * Math.random());
        d =  (int) (100 * Math.random());
        
        System.out.println("0-99: \t" + a + "\t"+b+"\t"+c+"\t"+d);

        //random from 10-20
        a = 10 + (int) (11 * Math.random());
        b = 10 + (int) (11 * Math.random());
        c = 10 + (int) (11 * Math.random());
        d = 10 + (int) (11 * Math.random());
        
        System.out.println("10-20: \t" + a + "\t"+b+"\t"+c+"\t"+d);


        //display four random doubles, 0-1
        System.out.println("0-1: \t" + Math.random()+"\t"+Math.random());
        System.out.println("0-1: \t" + Math.random()+"\t"+Math.random());

        r=10 * Math.random();
        System.out.println("0-9.99: \t" + r);
        System.out.println("0-9: \t" + (int)r);
        System.out.println("1-10: \t" + (1+(int)r));

        //random from 1-3
        a = 1 + (int) (3 * Math.random());
        b = 1 + (int) (3 * Math.random());
        c = 1 + (int) (3 * Math.random());
        d = 1 + (int) (3 * Math.random());
        
        System.out.println("1-3: \t" + a + "\t"+b+"\t"+c+"\t"+d);

    }
}
