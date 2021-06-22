package l6q2;

public class L6Q2 {

    public static void main(String[] args) {
        int num=4;
        char symbol='#';
        
        //triangle
        for(int i=0;i<num;i++){
            multiPrint(num-i-1,' ');
            multiPrint(2*i+1,symbol);
            System.out.println("");
        }
        System.out.println("");
        
        //diamond
        for(int i=0;i<=num/2;i++){
            if(num%2==0){
                multiPrint(num-i,' ');
            }else if(num%2!=0){
                multiPrint(num-i-1,' ');
            }
            multiPrint(2*i+1,symbol);
            System.out.println("");
        }
        for(int i=num/2,j=i;j>=0;i++,j--){
            multiPrint(i,' ');
            multiPrint(2*j+1,symbol);
            System.out.println("");
        }
    }
    public static void multiPrint(int n, char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
    }
    }
}
