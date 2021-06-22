/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q5;

import java.util.Scanner;

/**
 *
 * @author syaam
 */
public class L8Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Game p1=new Game("p1");
        Game p2=new Game("p2");
        boolean flag=true;
        while(p1.getFinalScore()<100 && p2.getFinalScore()<100){
            if(flag==true){
                p1.move();
                flag = !flag;
            }else{
                p2.move();
                flag = !flag;
            }    
        }
        if(p1.getFinalScore()>p2.getFinalScore()){
            System.out.println(p1.getName()+" wins");
        }else{
            System.out.println(p2.getName()+" wins");
        }
    }
    
}
