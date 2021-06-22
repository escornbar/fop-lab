/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q5;

import java.util.Random;

/**
 *
 * @author syaam
 */
public class Game {
    private String Name;
    private int finalScore;

    public Game(String Name) {
        this.Name = Name;
        this.finalScore = 0;
    }
       
    public void move(){
        Random r=new Random();
        int dice = r.nextInt(6)+1;
        finalScore+=dice;
        System.out.println(Name+" gets "+dice);
        System.out.println(Name+" current score is "+finalScore);
        System.out.println("");
    }
    
     public String getName() {
        return Name;
    }

    public int getFinalScore() {
        return finalScore;
    }
    
}
