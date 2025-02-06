import java.util.Scanner;
class MyException extends Exception
{

    public MyException(String message) {
        super(message);
    }
}
class bank
{
    int MIN_BAL = 500;
    public void Check(int Current) throws MyException
    {
        if (Current <= MIN_BAL)
        {
            throw new MyException("Your balance is tooo low...");
        }
    }
}
public class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank obj = new bank();
        int CurrBal;
        try{
            System.out.println("Enter the Current balance: ");
            CurrBal = sc.nextInt();
            obj.Check(CurrBal);
            System.out.println("you are good to go");
        }
        catch(MyException e)
        {
            System.out.println("Exception caught Message: "+e);
        }
        
    }
}