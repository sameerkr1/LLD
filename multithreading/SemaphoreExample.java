package org.example.multithreading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoreExample {

    public final Semaphore semaphore = new Semaphore(1);

    public void criticalSection() {
        try {
            semaphore.acquire();
            System.out.println("Critical section running " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {

        SemaphoreExample semaphoreExample = new SemaphoreExample();

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                //System.out.println("Running-1 " + Thread.currentThread().getName());
                semaphoreExample.criticalSection();
            }
        };

        AtomicInteger atomicInteger = new AtomicInteger();

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                semaphoreExample.criticalSection();
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
