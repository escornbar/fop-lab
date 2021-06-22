/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int[] num=new int[20];
        for(int i=0;i<num.length;i++){
            num[i]=r.nextInt(101);
        }
        System.out.println("Original Sets:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");;
        }
        System.out.println();
        for ( int pass = 1; pass < num.length; pass++ ){ 
            for ( int i = 0; i < num.length - 1; i++ ){ 
		if ( num[ i ] < num[ i + 1 ] ){
                    int hold = num[i];        
			num[i] = num[i+1];  
			num[i+1] = hold;
                }
            }    
        }
        System.out.println("Descending Sets: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.print("Enter an integer to be searched: ");
        int key=s.nextInt();
        
        int i;
        boolean search = false;
        
        for(i=0;i<num.length;i++){
            if(key==num[i]){
                System.out.println(key + " Found");
                search = true;
                break;
            }      
        }
        if(!search){
            System.out.println("Not Found");
            }
        System.out.println("Number of loops for linear search: "+i);
        
        int low = 0;  
        int high = num.length - 1; 
        int middle,counter=0;
        while ( low <= high ) {
            counter++;
            middle = ( low + high ) / 2;
	    if ( key == num[middle]) {
                System.out.println(key+" Found");
                search = true;
                break;
            } 
            else if ( key < num[middle] )
                high = middle - 1;  
	    else
                low = middle + 1;   
        }
        if (!search) {
            System.out.println("Not Found");
        }
        System.out.println("Number of loops for binary search: "+counter);
    }
    
}

