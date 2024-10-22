class Outer 
{
    void display()
    {
        System.out.println("Outer class ");
    }

    class Inner
    {
        void display()
        {
            System.out.println("Inner class ");
        }
    }
}
public class program8
{
    public static void main(String[] args) {
        
        Outer out_class = new Outer();
        out_class.display();

        Outer.Inner in_class = out_class.new Inner();
        in_class.display();
    }
}