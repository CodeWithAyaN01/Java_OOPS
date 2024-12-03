// package IA2; Runnable class

class MyRunnable implements Runnable {

    String threadname;
    public MyRunnable (String name) {
        this.threadname = name;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i<=5 ; i++) {
                System.out.println(threadname+"-count"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class program11
{
    public static void main(String[] args) {
        MyRunnable run1 = new MyRunnable("Thread 1");
        MyRunnable run2 = new MyRunnable("Thread 2");

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}