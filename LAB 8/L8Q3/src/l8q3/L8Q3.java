/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q3;

import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class L8Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("WELCOME TO THE WEIGHT CALCULATOR");
        System.out.print("Insert your age: ");
        int age=s.nextInt();
        System.out.print("Insert your height in cm: ");
        int height=s.nextInt();
        WeightCalculator a=new WeightCalculator(age, height);
        a.recWeight();
    }
    
}
