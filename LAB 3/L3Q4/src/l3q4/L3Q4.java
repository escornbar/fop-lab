package l3q4;

import java.util.Random;

public class L3Q4 {

        public static void main(String[] args) {
        int a,b,c,d,totp1,totp2,MAX=6;
        Random g = new Random();
        //player1
        a= g.nextInt(MAX)+1;
        b= g.nextInt(MAX)+1;
        //player2
        c= g.nextInt(MAX)+1;
        d= g.nextInt(MAX)+1;
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
        totp1= a+b;
        totp2= c+d;
        if(totp1 > totp2){
            System.out.println("-PLAYER 1 WINS-");
        }
        else if(totp1 < totp2){
            System.out.println("-PLAYER 2 WINS-");
        }
        else{
            System.out.println("-IT IS A DRAW-");
        }
        
        
        
    }
    
}
