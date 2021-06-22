/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q1;

import java.util.Scanner;

/**
 *
 * @author User
 */
class scanner {
    
     public static void main(String[] args) {
        double Fahrenheit, Celcius;
        Scanner s = new Scanner(System.in);
        System.out.println("Insert temperature in Fahrenheit: ");
        Fahrenheit=s.nextDouble();
        Celcius = (Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit + "F = " + Celcius + "C" );
    
}

    private double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
