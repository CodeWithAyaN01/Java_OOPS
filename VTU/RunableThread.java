class mythread implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0 ; i< 5 ; i++)
        {
            System.out.println("Thread - : ");
            
        }
    }
}

public class RunableThread {
    public static void main(String[] args) {
        
        mythread r = new mythread();
        Thread threadx = new Thread(r);
        threadx.start();
        
        System.out.println("End of the main thread :");
    }
}
