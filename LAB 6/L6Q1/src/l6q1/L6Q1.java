package l6q1;

public class L6Q1 {

    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.print(triNum(i));
            System.out.print(" ");
        }  
    }
    public static int triNum(int n){
        int val;
        val=(n*(n+1))/2;
        return val;
    }
}
