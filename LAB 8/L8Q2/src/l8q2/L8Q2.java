/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author syaam
 */
public class L8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=s.nextLine();
        System.out.print("Enter your ID number: ");
        String id=s.nextLine();
        System.out.print("Enter your deposit amount: ");
        int depoAmt=s.nextInt();
        
        BankAccount acc=new BankAccount(name,id,depoAmt);
        System.out.println("[1] Check Balance\n[2] Deposit\n[3] Withdraw\n[4] Quit");
        System.out.println("What you want to do today?");
        int choice=s.nextInt();
        while(choice!=4){
            switch(choice){
                case 1:
                    acc.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depo=s.nextInt();
                    acc.deposit(depo);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int withdraw=s.nextInt();
                    acc.withdraws(withdraw);
                    break;
                default:
                    System.out.println("Invalid input");
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(L8Q2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("\n[1] Check Balance\n[2] Deposit\n[3] Withdraw\n[4] Quit");
            System.out.println("What you want to do today?");
            choice=s.nextInt();
        }
    }
    
}
