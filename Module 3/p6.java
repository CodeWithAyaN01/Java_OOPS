// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Regular method with a body
    void display() {
        System.out.println("This is a shape");
    }
}

// Concrete class (subclass) extending the abstract class
class Circle extends Shape {
    // Providing implementation for the abstract method
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    // Providing implementation for the abstract method
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class p6 {
    public static void main(String[] args) {
        // Shape s = new Shape(); // Not allowed, since Shape is abstract

        // Creating objects of concrete subclasses
        Shape c = new Circle();
        Shape r = new Rectangle();

        // Calling methods
        c.draw();      // Outputs: Drawing a Circle
        c.display();   // Outputs: This is a shape
        r.draw();      // Outputs: Drawing a Rectangle
        r.display();   // Outputs: This is a shape
    }
}
