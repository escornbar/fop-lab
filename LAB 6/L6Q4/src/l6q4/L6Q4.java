package l6q4;

public class L6Q4 {

    public static void main(String[] args) {
        System.out.println(gcd(200,625));
    }
    public static int gcd(int a, int b) { 
        if (a == 0) 
            return b; 
        return gcd(b%a, a); 
    }
}
