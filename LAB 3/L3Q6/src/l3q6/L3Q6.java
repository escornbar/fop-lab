package l3q6;

import java.util.Scanner;

public class L3Q6 {

        public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        int r,x,y;
        System.out.print("Please enter the radius of circle: ");
        r = g.nextInt();
        System.out.print("Please enter coordinate of x: ");
        x = g.nextInt();
        System.out.print("Please enter coordinate of y: ");
        y = g.nextInt();
                
        if(Math.sqrt((x*x)+(y*y))>r){
            System.out.printf("(%d,%d) is outside the circle\n",x,y);
        }
        else{
            System.out.printf("(%d,%d) is inside the circle\n",x,y);
        }
        
        
    }
    
}
