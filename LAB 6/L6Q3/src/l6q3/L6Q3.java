package l6q3;

import java.util.Scanner;


public class L6Q3 {

    public static void main(String[] args) {
        int[] list=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.print("Input 10 integers: ");
        for(int i=0;i<list.length;i++){
           list[i]=s.nextInt(); 
        }
        System.out.println("Reversing.....");
        reverse(list);
        System.out.print("Reversed: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");;
        }
        
    }
    public static void reverse(int[] num){
        for ( int pass = 1; pass < num.length; pass++ ) 
         	// control number of comparison
		for ( int i = 0; i < num.length - 1; i++ ) 
			if ( num[ i ] < num[ i + 1 ] )  {
               		int hold = num[i];        
				num[i] = num[i+1];  
				num[i+1] = hold;
			}
        
    }
      
}
