package l2q1;

import java.util.Scanner;

public class L2Q1 {

    
    public static void main(String[] args) {
        double Fahrenheit, Celcius;
        Scanner s = new Scanner(System.in);
        System.out.println("Insert temperature in Fahrenheit: ");
        Fahrenheit=s.nextDouble();
        Celcius = (Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit + "F = " + Celcius + "C" );
    }
    
}
