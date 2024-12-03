// package IA2; class Mythread
class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
    }
    @Override
    public void run() {
        for (int i = 0 ; i<=5 ; i++) {

            System.out.println(Thread.currentThread().getName() + "-Count" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class program12 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Child Thread ");
        myThread.start();
        for(int i = 0; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "-Count" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}