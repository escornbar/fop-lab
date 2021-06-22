package l2q6;

import java.util.Scanner;

public class L2Q6 {

        public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double Mass, InitialT, FinalT, energy;
            System.out.println("Please insert current details");
            System.out.print("Mass of water in kg:");
            Mass = s.nextDouble();
            System.out.print("Initital temperature of water in Celcius:");
            InitialT = s.nextDouble();
            System.out.print("Final temperature of water in Celcius:");
            FinalT = s.nextDouble();
            energy = Mass*(FinalT-InitialT)*4184;
            System.out.printf("Energy needed is %gJ \n",energy);
        
    }
    
}
