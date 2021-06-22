package l4q2;

import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {
        int val=0,n, sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum = sum + j;
            } 
        }
        System.out.println(sum);
       
        
    }
    
}
