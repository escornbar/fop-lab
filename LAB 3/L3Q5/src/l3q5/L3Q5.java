package l3q5;

import java.util.Scanner;

public class L3Q5 {

        public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        Scanner g=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a=g.nextDouble();
        System.out.print("Enter value of b: ");
        b=g.nextDouble();
        System.out.print("Enter value of c: ");
        c=g.nextDouble();
        System.out.print("Enter value of d: ");
        d=g.nextDouble();
        System.out.print("Enter value of e: ");
        e=g.nextDouble();
        System.out.print("Enter value of f: ");
        f=g.nextDouble();
        
        if((a*d)-(b*c) == 0){
            System.out.println("The equation has no solution");
        }
        else{
            x=((e*d)-(b*f))/(a*d)-(b*c);
            y=((a*f)-(e*c))/(a*d)-(b*c);
            System.out.printf("x=%f\ty=%f",x,y);
        }
        
        
    }
    
}
