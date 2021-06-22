package l4q1;

import java.util.Scanner;

public class L4Q1 {
    
    public static void main(String[] args) {
        int val;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        val = s.nextInt();
        System.out.print("Factors of " + val + " are: ");
        for(int i=1;i<=val;i++){
            if(val%i == 0){
                System.out.print(i + " ");
            }
        }
    }  
}
