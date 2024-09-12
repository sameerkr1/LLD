package org.example.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {

    public static void main(String[] args) {
        // Step 1: Create an ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);  // Pool of 2 threads

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        };

        executorService.submit(task);

        // Step 3: Shutdown the ExecutorService
        executorService.shutdown();
    }
}
