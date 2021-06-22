package l3q3;

import java.util.Scanner;

public class L3Q3 {

        public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double sales, comm;
        System.out.print("Please enter sales volume: ");
        sales = k.nextDouble();
        if(sales<=100){
            System.out.printf("Commission is RM%.2f\n",sales*0.05);
        }
        else if(sales>100 && sales<=500){
            System.out.printf("Commission is RM%.2f\n",sales*0.075);
        }
        else if(sales>500 && sales<=1000){
            System.out.printf("Commission is RM%.2f\n",sales*0.1);
        }
        else{
            System.out.printf("Commission is RM%.2f\n",sales*0.125);
        }
    }
    
}
