package l5q1;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {

    
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int N,sum=0;
        System.out.print("Enter number of students: ");
        N=s.nextInt();
        int[] scores=new int[N];
        for(int i=0;i<scores.length;i++){
            scores[i]=r.nextInt(101);
        }
        
        //list of score
        for(int i=0;i<scores.length;i++){
            System.out.print(scores[i]+" ");
        }
        
        for(int i=1;i<scores.length;i++){
            for(int k=0;k<scores.length-1;k++){
                if(scores[k]>scores[k+1]){
                    int hold=scores[k];
                        scores[k]=scores[k+1];
                        scores[k+1]=hold;
                }
            }
        }
        
        //statistics
        System.out.println("\nHighest score: "+scores[N-1]);
        System.out.println("Lowest score: "+scores[0]);
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        double avg=(double)sum/N;
        System.out.printf("Average score: %.2f\n",avg);
    }
    
}
