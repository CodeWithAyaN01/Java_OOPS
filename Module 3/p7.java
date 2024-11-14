abstract class shape 
{
    abstract void draw();

    abstract void name();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("Circle is drawn: ");
    }
    void name()
    {
        System.out.println("The name of the shape is Circle: ");
    }
}

class Triangle extends shape
{
    void draw()
    {
        System.out.println("triangle is drawn: ");
    }
    void name()
    {
        System.out.println("The name of the shape is triangle: ");
    }
}

public class p7{
    public static void main(String[] args) {
        shape c = new circle();
        shape t = new Triangle();

        c.draw();
        c.name();

        t.draw();
        t.name();

    }
}
