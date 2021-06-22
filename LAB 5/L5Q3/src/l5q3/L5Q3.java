/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int Nworkers, totalwh=0, MAX=9, MIN=1;
        int[] hours=new int[7];
        System.out.print("Enter number of employee(s): ");
        Nworkers=s.nextInt();
        for(int i=1;i<Nworkers+1;i++){
            totalwh=0;
            System.out.println("\n");
            System.out.println("Employee "+i);
            System.out.println("M T W T F S S");
            for(int j=0;j<hours.length;j++){
                hours[j]=r.nextInt(MAX-MIN)+1;
                System.out.print(hours[j]+" ");
                totalwh+=hours[j];
            }
            System.out.println("\nTotal work hours: "+totalwh);
        }
        
        
    }
    
}
