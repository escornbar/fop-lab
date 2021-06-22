package l9q1;

public class Circle extends Shape {
    private double diameter;

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }
    
    public void compute(){
        setPerimeter(Math.PI*this.diameter);
        setArea(Math.PI*Math.pow(this.diameter/2,2));
    }

    public String toString() {
        return "Name: "+getName()+String.format("\nPerimeter: %.2f", getPerimeter())+String.format("\nPerimeter: %.2f", getArea());
    }
    
}
