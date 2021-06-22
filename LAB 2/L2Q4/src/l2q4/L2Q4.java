package l2q4;

import java.util.Scanner;

public class L2Q4 {

        public static void main(String[] args) {
        int sec1, hrs, min, sec2;
        Scanner s= new Scanner(System.in);
        System.out.print("Insert the time in seconds: ");
        sec1 = s.nextInt();
        hrs=sec1/3600;
        min=(sec1%3600)/60;
        sec2= sec1 - (hrs*3600) - (min*60);
        System.out.println(hrs+"hours "+min+"minutes "+sec2+"seconds");
    }
    
}
