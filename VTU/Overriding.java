class A{
    final void show() // we cannot override this method because it has final keyword to it
    {
        System.out.println("inside A");
    }
}
class B extends A{
    void show1()
    {
        System.out.println("indside B");
    }
}
class C extends A{
    void show1()
    {
        System.out.println("indside C");
    }
}
public class Overriding {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
       B o = new B();
       o.show();
    }
}
