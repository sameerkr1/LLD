package org.example.lld.queuemanagement;

import lombok.Getter;

import java.util.LinkedList;
import java.util.Queue;

@Getter
public class Consumer {
    private int id;
    private String name;

    Consumer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void consume(Queue queue) throws InterruptedException {
        Queue<String> localQueue = new LinkedList<>(queue);
        while (!localQueue.isEmpty()) {
            System.out.println(localQueue.poll());
        }

        Consumer consumer = new Consumer(id, name);

        synchronized (consumer){
            consumer.wait();
        }
    }
}
