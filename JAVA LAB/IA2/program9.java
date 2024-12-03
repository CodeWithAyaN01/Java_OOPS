import java.util.Scanner;
class DivisionByZero extends Exception{
    public DivisionByZero(String message)
    {
        super(message);
    }
}class Calculator {
    // Method
    public static double divide(int numerator,int denominator) throws DivisionByZero
    {
        if (denominator == 0)
        {
            throw new DivisionByZero("Division by zero not Allowed");
        }

        return (double)numerator/denominator;
    }
}
public class program9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try 
       {
            System.out.println("Enter the value of numberator: ");
            int num = sc.nextInt();    
            System.out.println("Enter the value of denominator: ");
            int dim = sc.nextInt();

            double result = Calculator.divide(num, dim);

            System.out.println("the result is "+result);
        }
        catch(DivisionByZero e){
            System.out.println("Exception caught "+ e.getMessage());
        }finally{
            System.out.println("Program end: ");
        }
        
    }
}