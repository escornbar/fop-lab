/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q2;

/**
 *
 * @author syaam
 */
public class BankAccount {
    private String name, id;
    private double accBalance;

    public BankAccount(String name, String id, double depoAmt) {
        this.name = name;
        this.id = id;
        this.accBalance = depoAmt;
    }
    
    public boolean deposit(int amount){
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return false;
        }else{
            this.accBalance+=amount;
            return true;
        }
    }
    
    public boolean withdraws(int amount){
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return false;
        }else if(this.accBalance<amount){
            System.out.println("Account balance insufficient");
            return false;
        }else{
            this.accBalance-=amount;
            return true;
        }
    }
    
    public void checkBalance(){
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Balance: "+this.accBalance);
    }
    
}
