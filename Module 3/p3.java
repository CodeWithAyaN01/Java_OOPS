class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

class Bike5 extends Vehicle {
    Bike5() {
        super(); // Will invoke the parent class constructor
        System.out.println("Bike is created");
    }

}
public class p3
{
    public static void main(String args[]) {
        Bike5 b = new Bike5();
    }

}
