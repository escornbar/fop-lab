/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q4;

/**
 *
 * @author syaam
 */
public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        
        this.denominator = denominator;
        
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(this.denominator==0){
            System.out.println("MATH ERROR, Denominator cannot be 0");
        }else{
        this.denominator = denominator;
        }
    }
    
    public void simpFraction(){
        if(this.numerator==0){
            System.out.println("0");
        }else if(this.denominator==0){
            System.out.println("MATH ERROR, denominator cannot be 0");
        }else{
            int gcd=gcd(this.numerator,this.denominator);
            System.out.println(this.numerator/gcd+"/"+this.denominator/gcd);
        }
    }
    
    public static int gcd(int a,int b){
        int gcd=0;
        for(int i = 1; i <= a && i <= b; ++i){
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd = i;    
            }
        return gcd;
        }    
    
}
