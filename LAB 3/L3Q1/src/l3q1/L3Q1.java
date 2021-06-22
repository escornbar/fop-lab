package l3q1;

import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        int num1, num2;
        
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        switch(operator){
            case (int)'+':
                System.out.printf("%d %c %d = %4.2f\n", num1, operator, num2, (float)(num1+num2));
                break;
                
            case (int)'-':
                System.out.printf("%d %c %d = %4.2f\n", num1, operator, num2, (float)(num1-num2));
                break;
                
            case (int)'*':
                System.out.printf("%d %c %d = %4.2f\n", num1, operator, num2, (float)(num1*num2));
                break;
            
            case (int)'/':
                if(num2==0){
                    System.out.println("Divisor cannot be zero\n");
                } else {
                System.out.printf("%d %c %d = %4.2f\n", num1, operator, num2, ((float)num1/num2));
                }
                break;
            
            case (int)'%':
                System.out.printf("%d %c %d = %d\n", num1, operator, num2, (num1%num2));
                break;
            
            default:
                System.out.println("Please enter valid operator\n");
        
    }
        
    }
    
}
