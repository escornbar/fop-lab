package l2q5;

import java.util.Random;

public class L2Q5 {

        public static void main(String[] args) {
        Random g = new Random();
        int ehek = g.nextInt(10001);
        System.out.println(ehek);
        int total = 0;
        while (ehek>0) {
        int add = ehek % 10;
        total = total + add;
        ehek = ehek/10;
    }
    System.out.println(total);
        
    }
    
}
