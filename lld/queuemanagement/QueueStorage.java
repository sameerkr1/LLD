package org.example.lld.queuemanagement;

import java.util.*;

public class QueueStorage {

    private Queue queue = new LinkedList();
    private String topicName;
    private Set<Consumer> consumers = new HashSet<>();

    QueueStorage(String topicName) {
        this.topicName = topicName;
    }

    public void setConsumers(Consumer consumer) {
        consumers.add(consumer);
    }

    public void push(String item) {
        queue.add(item);
        notifyConsumers();
    }

    public void notifyConsumers() {
        for (Consumer consumer : consumers) {
            consumer.consume(queue);
        }
        queue.clear();
    }
}
