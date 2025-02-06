
class mythread extends Thread // this is a thread
{
    @Override
    public void run()
    {
        for(int i = 0; i <5 ; i++)
        {
            System.out.println("from thread A: ");
        }
    }
}

public class Tclass
{
    
    public static void main(String[] args) {
        
        mythread t1 = new mythread();

        t1.start();
    }
}
