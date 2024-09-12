package org.example.multithreading;

public class Resturent {
    public static void main(String[] args) {

        Runnable r = new Runnable() {

            public void prepareFood() {
                System.out.println("Hello World!");
            }

            @Override
            public void run() {
                prepareFood();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}
