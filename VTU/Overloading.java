public class Overloading {
    void printkaro(String name)
    {
        System.out.println("Hello my name is : " + name);
    }

    void printkaro(int age) 
    {
        System.out.println("My age is: "+ age);
    }

    void printkaro(double sal)
    {
        System.out.println("My sal is : "+ sal);
    }

    void printkaro(float num)
    {
        System.out.println("The floating numbe is " + num);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.printkaro("Ayan");
        obj.printkaro(12);
        obj.printkaro(454.234464354356);
        obj.printkaro(4.23f);
    }
}
