// package IA2;
// abstrat class

abstract class Shape{
    public abstract double CalArea();
    public abstract double CalPerimeter();
}
class Circle extends Shape{
    private double radius;

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