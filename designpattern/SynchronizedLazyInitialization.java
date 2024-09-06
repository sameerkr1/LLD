package org.example.designpattern;

public class SynchronizedLazyInitialization {
    private static SynchronizedLazyInitialization instance = null;

    private SynchronizedLazyInitialization() {};

    synchronized public static SynchronizedLazyInitialization getInstance() {
        if(instance == null) {
            instance = new SynchronizedLazyInitialization();
        }
        return instance;
    }
}
