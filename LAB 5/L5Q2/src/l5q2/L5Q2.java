package l5q2;

import java.util.Random;

public class L5Q2 {

    
    public static void main(String[] args) {
        /*Random r=new Random();
        int[] numbers=new int[10];
        int randomIndex, randomValue;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i;
        }
        
        for(int i=0;i<numbers.length;i++){
            randomIndex=r.nextInt(20-0)+1;
            randomValue=numbers[randomIndex];
            numbers[randomIndex]=numbers[i];
            numbers[i]=randomValue;
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }*/
        
        final int MAX = 9;
        int[] number = new int[4];
        int temp;
        boolean status;
        Random g = new Random();
        for(int i=0; i<number.length; i++) {
            status = true;
            temp = g.nextInt(MAX);
            for(int j=0; j<i; j++)
                if (temp==number[j]) {
                    status = false;
                    break;
                }
            if (status){
                number[i] = temp;
                System.out.print(number[i]+" ");
            }
            else
                i--;
        }
        
        
    }
    
}
