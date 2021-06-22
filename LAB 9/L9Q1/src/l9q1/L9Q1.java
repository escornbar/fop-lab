package l9q1;

public class L9Q1 {

    public static void main(String[] args) {
        Shape s1=new Shape("Oval");
        s1.setPerimeter(10);
        s1.setArea(30);
        System.out.println(s1.toString()+"\n");
        
        Rectangle r1=new Rectangle("Rectangle",10,20);
        r1.compute();
        System.out.println(r1.toString()+"\n");
        
        Square a=new Square("Square",10);
        a.compute();
        System.out.println(a.toString()+"\n");
        
        Circle b=new Circle("Circle",10);
        b.compute();
        System.out.println(b.toString()+"\n");
    }
    
}
