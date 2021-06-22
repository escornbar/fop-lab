package l4q3;

import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {        
        // Input
        int score, count = 0, min = 100, max = 0, total = 0;
        double average = 0, s = 0;
        Scanner g=new Scanner(System.in);
        
        boolean status = true;
        do {
            System.out.print("Enter a score [negative score to quit]: ");
            score = g.nextInt();
            count++;
            if (score < 0) {
                status = false;
            } 
            else {
                // Max
                if (score > max) {
                    max = score;
                }
                
                // Min
                if (score < min) {
                    min = score;
                }
                
                // Calculation
                total = total + score;
                s = s + Math.pow(score, 2);
            }
            
       } while (status);
        
        // Further Calculation
        count = count - 1;
        average = total / count;
        s = Math.sqrt((s - (Math.pow((total), 2)/count))/(count - 1));
                
        System.out.println("\nMinimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f", s);
        System.out.println();
    }
    
}
