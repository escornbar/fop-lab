
package l2q2;

import java.util.Scanner;

class L2Q2 {
    public static void main(String[] args) {
        double P, D, R, Y, M=33.555555;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to car loan monthly payment calculator");
        System.out.println("Please insert the following details");
        System.out.print("Price of car:RM ");
        P = s.nextDouble();
        System.out.print("Downpayment:RM ");
        D = s.nextDouble();
        System.out.print("Interest Rate in %: ");
        R = s.nextDouble();
        System.out.print("Loan duration in year: ");
        Y = s.nextDouble();
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Your monthly payment is RM%.2f\n",M);
        
    }
    
}
