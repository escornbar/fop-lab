package l8q1;

import java.util.Random;
import java.util.Arrays;

public class Number {
    private int[] Array;
    private int dimension;
    Random r=new Random();
    
    public Number() {
        Random r=new Random();
        dimension=10;
        Array=new int[10];
        for(int i=0;i<dimension;i++){
            Array[i]=r.nextInt(101);
        }
    }

    public Number(int dimension) {
        Random r=new Random();
        this.dimension = dimension;
        Array=new int[dimension];
        for(int i=0;i<dimension;i++){
            Array[i]=r.nextInt(101);
        }
    }
    
    public Number(int dimension, int range) {
        Random r=new Random();
        this.dimension = dimension;
        Array=new int[dimension];
        for(int i=0;i<dimension;i++){
            Array[i]=r.nextInt(range+1);
        }
    }
       
    public void printAll(){
        for(int i=0;i<this.dimension;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println("");
    }
    
    public void printEven(){
        System.out.print("Even numbers: ");
        for(int i=0;i<this.dimension;i++){
            if(Array[i]%2==0){
                System.out.print(Array[i]+" ");
            }
        }
        System.out.println("");
    }
    
    public void printPrime(){
        System.out.print("Prime numbers: ");
        for(int i=0;i<this.dimension;i++){
            if(isPrime(Array[i]))
            System.out.print(Array[i]+" ");
        }
        System.out.println("");
    }
    
    private boolean isPrime(int num){
            if(num<= 1){
                return false;
            }
            for (int i = 2; i < num/2; i++) {
                if(num % i ==0){
                    return false;
                }
            }
            return true;
        }
    
    public void printMAX(){
        int max=Array[0];
        for(int i=1;i<this.dimension;i++){
            if(Array[i]>max){
                max=Array[i];
            }
        }
        System.out.println("Max number: "+max);
    }
    
    public void printMIN(){
        int min=Array[0];
        for(int i=1;i<this.dimension;i++){
            if(Array[i]<min){
                min=Array[i];
            }
        }
        System.out.println("Min number: "+min);
    }
    
    public void printAverage(){
        int sum=0;
        for(int i=0;i<this.dimension;i++){
            sum+=Array[i];
        }
        System.out.println("Average: "+sum/(double)this.dimension);
    }
    
    public void printSquareNum(){
        System.out.println("Square numbers in the array: ");    
        for (int i = 0; i < this.dimension; i++) {
            double sqr = Math.sqrt(Array[i]);
            if(sqr == (int)sqr){
                System.out.print(Array[i] + " ");
           }
        }
        System.out.println("");
        }
        
}
            
    

