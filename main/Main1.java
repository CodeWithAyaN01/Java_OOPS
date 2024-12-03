import java.util.Scanner;
public class Main1
{
    static Scanner sc = new Scanner(System.in);
    static int a,b,c;
    static void TakeInput()
    {
        System.out.print("Enter 1st number:");
        a = sc.nextInt(); 
        System.out.print("Enter 2nd number:");
        b = sc.nextInt(); 
        System.out.print("Enter 3rd number:");
        c = sc.nextInt(); 
    }
    int GreatestOfThree()
    {
        if ((a >= b) && (a >= c))
        {
            // System.out.println("A is greatest: "+a);
            return a;
        }
        else if ((b >= a) && (b >= c))
        {
            // System.out.println("B is greatest: "+b);
            return b;
            
        }
        else {
            // System.out.println("C is greatest: "+c);
            return c;
        }
    }
    void Display()
    {
        int temp = GreatestOfThree();
        System.out.println("The Greatest Number is : " + temp);
    }
   
    public static void main(String[] args) {
        Main1 obj = new Main1();

        TakeInput();
        obj.GreatestOfThree();
        obj.Display();
    }
}