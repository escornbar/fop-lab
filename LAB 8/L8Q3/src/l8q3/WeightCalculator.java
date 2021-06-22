/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q3;

/**
 *
 * @author syaam
 */
public class WeightCalculator {
    private int age, height;

    public WeightCalculator(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void recWeight(){
        double recWeight=((double)this.height-100+(double)this.age/10)*0.9;
        System.out.println("Age: "+age);
        System.out.println("Height: "+height+"cm");
        System.out.println("Recommended Weight: "+recWeight+"kg");
    }
}
