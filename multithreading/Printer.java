package org.example.multithreading;

public class Printer {

    private static int count = 1;
    private static Object lock = new Object();
    private static int N = 20;


    public static class EvenPrinter implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (count <= N && count % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    if (count > N) {
                        lock.notify();
                        break;
                    }

                    System.out.println(count);
                    count++;
                    lock.notify();
                }
            }
        }
    }

    public static class OddPrinter implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (count < N && count % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }


                    if (count > N) {
                        lock.notify();
                        break;
                    }

                    System.out.println(count);
                    count++;
                    lock.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenPrinter evenPrinter = new EvenPrinter();
        OddPrinter oddPrinter = new OddPrinter();

        Thread t1 = new Thread(evenPrinter);
        Thread t2 = new Thread(oddPrinter);
        t1.start();
        t2.start();
    }
}
