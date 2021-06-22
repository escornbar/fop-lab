/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q6;

/**
 *
 * @author syaam
 */
public class L6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int testNum = 1;

        int[] palindromicPrimes = new int[20];
        int[] emirps = new int[20];
        int counter1=0, counter2=0;
        do{
            if(isPalindromicPrime(testNum)&&counter1<20){
                palindromicPrimes[counter1] = testNum;
                counter1++;
                
            }else if(isEmirp(testNum)&&counter2<20){
                emirps[counter2] = testNum;
                counter2++;
            }
            testNum++;
        }while(counter1!=20||counter2!=20);
        
        System.out.print("Palindromic Primes: ");
        for (int i = 0; i < palindromicPrimes.length; i++) {
            System.out.print(palindromicPrimes[i]+" ");
            
        }
        System.out.println("");
        System.out.print("Emirps: ");
        for (int i = 0; i < emirps.length; i++) {
            System.out.print(emirps[i]+ " ");
            
        }
        System.out.println("");
    }
    
    public static boolean isPalindromicPrime(int num){
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        sb.reverse();
        
        if(sb.toString().equals(Integer.toString(num))&&isPrime(num)){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isEmirp(int num){
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        sb.reverse();
        if(isPrime(num)&&isPrime(Integer.parseInt(sb.toString()))&&!isPalindromicPrime(num)){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}