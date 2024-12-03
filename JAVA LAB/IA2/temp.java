// abstrat class
abstract class Shape{
    public abstract double CalArea();
    public abstract double CalPerimeter();
}
class Circle extends Shape{
    private double radius;
    // Cons
    public Circle(double radius){
        this.radius = radius;
    }

    public double CalArea()
    {
        return Math.PI*radius*radius;
    }
    public double CalPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
class Triangle extends Shape{
    private double side1,side2,side3;
    // Cons
    public Triangle(double side1,double side2,double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double CalArea()
    {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s-side1) * (s-side2) * (s-side3));
    }

    public double CalPerimeter()
    {
        return side1+side2+side3;
    }
}
public class temp
{
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area of Circle is "+c.CalArea());
        System.out.println("Perime of Circle is "+c.CalPerimeter());

        Triangle t = new Triangle(2, 2, 2);
        System.out.println("Area of trian is "+t.CalArea());
        System.out.println("Perime of Trian is "+t.CalPerimeter());
    }
}