package l9q1;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double sideLength1, sideLength2;

    public Rectangle(String name, double sideLength1, double sideLength2) {
        super(name);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public void compute(){
        setPerimeter(2*this.sideLength1+2*this.sideLength2);
        setArea(this.sideLength1*this.sideLength2);
    }

    public String toString() {
        return "Name: "+getName()+"\nPerimeter: "+getPerimeter()+"\nArea: "+getArea();
    }
   
}
        