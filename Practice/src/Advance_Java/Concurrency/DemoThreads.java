package Advance_Java.Concurrency;

public class DemoThreads {
    public static void main(String[] args) {
        Runnable obja = () -> {
            for (int i = 0; i <= 1000; ++i) {
                System.out.println("Thread A: " + i);
            }
        };
        Runnable objb = () -> {
            for (int i = 0; i <= 1000; ++i) {
                System.out.println("Thread B: " + i);
            }
        };
        Thread t1 = new Thread(obja);
        Thread t2 = new Thread(objb);
        t1.start();
        t2.start();
    }
}