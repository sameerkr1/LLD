package org.example.lld.queuemanagement;

public class Producer {
    private int id;
    private String name;
    private QueueStorage queueStorage;

    Producer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setQueueStorage(QueueStorage queueStorage) {
        this.queueStorage = queueStorage;
    }

    public void push(String item){
        queueStorage.push(item);
    }
}
