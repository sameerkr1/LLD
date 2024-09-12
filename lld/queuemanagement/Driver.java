package org.example.lld.queuemanagement;

public class Driver {

    public static void main(String[] args) {
        Producer producer1 = new Producer(1, "Sameer");
        Producer producer2 = new Producer(2, "Sameer-");
        Consumer consumer1 = new Consumer(1, "Sameer");
        Consumer consumer2 = new Consumer(2, "Ankit");
        Consumer consumer3 = new Consumer(2, "Ankit");

        QueueManagementSystem queueManagementSystem = new QueueManagementSystem();
        queueManagementSystem.createTopic("order");
        queueManagementSystem.registerProducerToTopic(producer1, "order");
        queueManagementSystem.registerProducerToTopic(producer2, "order");
        queueManagementSystem.registerConsumerToTopic(consumer1, "order");
        queueManagementSystem.registerConsumerToTopic(consumer2, "order");
        queueManagementSystem.registerConsumerToTopic(consumer3, "order");
        //queueManagementSystem.registerConsumerToTopic(consumer3, "order");


        producer1.push("hey");
        producer2.push("hey-ram");
    }
}
