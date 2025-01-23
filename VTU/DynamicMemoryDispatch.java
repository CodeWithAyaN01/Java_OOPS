
import javax.management.ObjectName;

class Computer {
    void print()
    {
        System.out.println("inside Computer");
    }
}
class Laptop extends Computer{
    void print()
    {
        System.out.println("Inside Laptop");
    }
}
class Mobile extends Computer{
    void print()
    {
        System.out.println("inside Mobile");
    }
}
public class DynamicMemoryDispatch{
    public static void main(String[] args) {
        Computer obj = new Laptop(); // obj is type Computer
        obj.print();

        obj = new Mobile();
        obj.print();

        obj = new Computer();
        obj.print();

    }
}