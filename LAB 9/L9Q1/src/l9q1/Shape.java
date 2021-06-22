package l9q1;

public class Shape {
    private String name;
    private double perimeter, area;

    public Shape(String name) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "Name: "+this.name+String.format("\nPerimeter: %.2f", this.perimeter)+String.format("\nArea: %.2f", this.area);
    }
    
    
}
