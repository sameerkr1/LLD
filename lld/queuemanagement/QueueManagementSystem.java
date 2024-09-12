package org.example.lld.queuemanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueueManagementSystem {

    Map<String, QueueStorage> mapOfTopicNameAndQueueSystem = new HashMap<>();

    public void createTopic(String topicName) {
        QueueStorage queueStorage = new QueueStorage(topicName);
        mapOfTopicNameAndQueueSystem.put(topicName, queueStorage);
    }

    public void registerProducerToTopic(Producer producer, String topicName) {
        QueueStorage queueStorage = mapOfTopicNameAndQueueSystem.get(topicName);
        if (queueStorage != null) {
            producer.setQueueStorage(queueStorage);
        } else {
            System.out.println("Please enter correct topic name");
        }
    }

    public void registerConsumerToTopic(Consumer consumer, String topicName) {
        QueueStorage queueStorage = mapOfTopicNameAndQueueSystem.get(topicName);
        if (queueStorage != null) {
            queueStorage.setConsumers(consumer);
        } else {
            System.out.println("Please enter correct topic name");
        }
    }

}
