

class A extends Thread
{
    A(String name)
    {
        super(name);
    }
    
    @Override
    public void run()
    {
        System.out.println("Thread from "+Thread.currentThread().getName()+" is running");
        for (int i = 0 ; i < 4 ; i++)
        {  
            try {
                System.out.println("tyhread count \n"+i+1 + "for "+ Thread.currentThread().getName());
                Thread.sleep(500);
            
            } catch (Exception e) {
                System.out.println("Caught Exp" + e);
            }    
        }
        System.out.println("Quiting" + Thread.currentThread().getName());
    }
}
// class B extends Thread
// {
    
//     @Override
//     public void run()
//     {
//         System.out.println("Thread from B is running");
//         for (int i = 0 ; i < 4 ; i++)
//         {  
//             try {
//                 System.out.println("tyhread count "+i+1);
//                 Thread.sleep(500);
            
//             } catch (Exception e) {
//                 System.out.println("Caught Exp" + e);
//             }    
//         }
//         System.out.println("Quiting Thread B");
//     }
// }

// class C extends Thread
// {
    
//     @Override
//     public void run()
//     {
//         System.out.println("Thread from C is running");
//         for (int i = 0 ; i < 4 ; i++)
//         {  
//             try {
//                 System.out.println("tyhread count "+i+1);
//                 Thread.sleep(500);
            
//             } catch (Exception e) {
//                 System.out.println("Caught Exp" + e);
//             }    
//         }
//         System.out.println("Quiting Thread C");
//     }
// }
// class D extends Thread
// {
    
//     @Override
//     public void run()
//     {
//         System.out.println("Thread from D is running");
//         for (int i = 0 ; i < 4 ; i++)
//         {  
//             try {
//                 System.out.println("tyhread count "+i+1);
//                 Thread.sleep(500);
            
//             } catch (Exception e) {
//                 System.out.println("Caught Exp" + e);
//             }    
//         }
//         System.out.println("Quiting Thread D");
//     }
// }
public class Question {
    public static void main(String[] args) {
        Thread a = new A("T1");
        Thread b = new A("T2");
        Thread c = new A("T3");
        Thread d = new A("T4");

        a.start();
        b.start();
        c.start();
        d.start();
    }
}
