import java.io.*;
import java.lang.*;
import java.util.*;

class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Runnable {
    public static void main(String[] args) {
        MyThread myRunnable = new MyThread();
        Thread t = new Thread(myRunnable);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
