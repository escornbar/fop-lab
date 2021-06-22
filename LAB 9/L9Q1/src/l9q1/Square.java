package l9q1;

public class Square extends Shape{
    private double sideLength;

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }
    
    public void compute(){
        setPerimeter(this.sideLength+this.sideLength);
        setArea(this.sideLength*this.sideLength);
    }

    public String toString() {
        return "Name: "+getName()+"\nPerimeter: "+getPerimeter()+"\nArea: "+getArea();
    }
    
    
}
