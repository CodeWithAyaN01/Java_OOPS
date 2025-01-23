
class bankEx extends Exception
{
    int Current;
    static int Min = 1000000;

    bankEx(int Current)
    {
        this.Current = Current;
    }
    @Override
    public String toString()
    {
        return "This is not Good Babu";
    }
    void Check(int Current) throws bankEx
    {
        if (Current < Min)
        {
            throw new bankEx(Current);
        }

    }
}

public class Ex2
{
    public static void main(String[] args) {
        bankEx obj2 = new bankEx(10000);
        System.out.println("Enter your current balance: ");
        try{
            obj2.Check(obj2.Current);
        }
        catch(bankEx e)
        {
            System.out.println("The Exception is : "+e);
        }
    }
}
