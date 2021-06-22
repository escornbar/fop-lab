package l2q3;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        Random g = new Random();
        int num1, num2, num3, i;
        double sum, avg;
        final int MAX=50, MIN=10;
        num1=g.nextInt(MAX-MIN+1)+MIN;
        num2=g.nextInt(MAX-MIN+1)+MIN;
        num3=g.nextInt(MAX-MIN+1)+MIN;
        sum = num1 + num2 + num3;
        avg = sum/3;
        System.out.println(num1+" "+num2+" "+num3);
        System.out.println(sum);
        System.out.printf("%.2f\n",avg);
        
    }
    
}
